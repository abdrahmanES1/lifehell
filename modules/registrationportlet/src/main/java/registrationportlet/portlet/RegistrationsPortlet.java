package registrationportlet.portlet;

import registrationportlet.constants.RegistrationportletPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import com.example.events.model.Event;
import com.example.events.model.Registration;
import com.example.events.service.EventLocalService;
import com.example.events.service.RegistrationLocalService;
import com.liferay.portal.kernel.exception.PortalException;

import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;

import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Reference;
/**
 * @author mac
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Registrations And Upcoming Events",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RegistrationportletPortletKeys.REGISTRATIONPORTLET,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RegistrationsPortlet extends MVCPortlet {

    @Reference
    private EventLocalService eventLocalService;

    @Reference
    private RegistrationLocalService registrationLocalService;

    // Render upcoming events
    @Override
    public void render(RenderRequest request, RenderResponse response) {
       
    	try {
            Date currentDate = new Date();
            List<Event> upcomingEvents = eventLocalService.getUpcomingEvents(currentDate);
            System.out.println("*".repeat(100));
            System.out.println(upcomingEvents);
            System.out.println("*".repeat(100));
            request.setAttribute("upcomingEvents", upcomingEvents);

            super.render(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // Handle user registration for an event
    public void registerUser(ActionRequest request, ActionResponse response) {
        long eventId = ParamUtil.getLong(request, "eventId");
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(com.liferay.portal.kernel.util.WebKeys.THEME_DISPLAY);
        long userId = themeDisplay.getUserId();

        try {
            // Check if the user is already registered
            Registration existingRegistration = registrationLocalService.fetchRegistration(eventId, userId );
            if (existingRegistration != null) {
                throw new PortalException("You are already registered for this event.");
            }

            // Check event capacity
            Event event = eventLocalService.getEvent(eventId);
            int currentRegistrations = registrationLocalService.getRegistrationsCount(eventId);
            if (currentRegistrations >= event.getCapacity()) {
                throw new PortalException("This event is full.");
            }

            // Register the user
            Registration registration = registrationLocalService.addRegistration(eventId, userId);
            SessionMessages.add(request, "success", "You have successfully registered for the event!");
        } catch (PortalException e) {
            SessionErrors.add(request, "error", e.getMessage());
        }
        
    }
}
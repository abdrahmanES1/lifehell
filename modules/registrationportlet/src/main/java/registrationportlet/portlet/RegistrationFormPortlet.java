package registrationportlet.portlet;


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
import com.liferay.portal.kernel.util.ParamUtil;



import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;


import org.osgi.service.component.annotations.Reference;
/**
 * @author mac
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=Events",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Registration Form",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/registrationForm.jsp",
		"javax.portlet.name=registrationportlet_RegistrationFormPortlet",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RegistrationFormPortlet extends MVCPortlet {

    @Reference
    private EventLocalService eventLocalService;

    @Reference
    private RegistrationLocalService registrationLocalService;


    // Handle user registration for an event
    public void registerUser(ActionRequest request, ActionResponse response) {
        long eventId = ParamUtil.getLong(request, "eventId");
        String username = ParamUtil.getString(request, "username");
        String email = ParamUtil.getString(request, "email");
        
        System.out.println("*".repeat(100));
        
        System.out.println(eventId);
        System.out.println(email);
        System.out.println(username);
        System.out.println("*".repeat(100));
        try {
            // Check if the user is already registered
            Registration existingRegistration = registrationLocalService.fetchRegistration(eventId, username );
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
            Registration registration = registrationLocalService.addRegistration(eventId, username,email);
            SessionMessages.add(request, "success", "You have successfully registered for the event!");
        } catch (PortalException e) {
            SessionErrors.add(request, "error", e.getMessage());
        }
        
    }
}
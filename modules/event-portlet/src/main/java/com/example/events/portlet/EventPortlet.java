package com.example.events.portlet;

import com.example.events.constants.EventPortletKeys;
import com.example.events.model.Event;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.example.events.service.EventLocalService;
import com.example.events.service.EventLocalServiceUtil;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
/**
 * @author mac
 */
@Component(
	property = {
	        "com.liferay.portlet.display-category=Events",
	        "com.liferay.portlet.instanceable=true",
	        "javax.portlet.display-name=Events Management",
	        "javax.portlet.init-param.template-path=/",
	        "javax.portlet.init-param.view-template=/view.jsp",
	        "javax.portlet.name=com_example_events_web_portlet_EventsPortlet",
	        "javax.portlet.resource-bundle=content.Language",
	        "javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EventPortlet extends MVCPortlet {
	  // View all events
   /* 
	@Override
	public void doView(RenderRequest request, RenderResponse response) throws IOException, PortletException {
	    List<Event> events = _eventLocalService.getEvents(-1, -1);
	    request.setAttribute("events", events);
	    super.doView(request, response);
	}
	
	*/
    // Add event action
    public void addEvent(ActionRequest request, ActionResponse response) 
        throws PortletException {
        
        try {
                 
            String title = ParamUtil.getString(request, "title");
            String description = ParamUtil.getString(request, "description");
            Date eventDate = ParamUtil.getDate(request, "eventDate", new SimpleDateFormat("yyyy-MM-dd"));
            String location = ParamUtil.getString(request, "location");
            int capacity = ParamUtil.getInteger(request, "capacity");
          
           
            _eventLocalService.addEvent(
                title, description, 
                eventDate, location, capacity);
            
            SessionMessages.add(request, "eventAdded");
            response.setRenderParameter("mvcPath", "/view.jsp");
            
        } catch (Exception e) {
            SessionErrors.add(request, e.getClass().getName());
            response.setRenderParameter("mvcPath", "/edit_event.jsp");
        }
    }
    
    // Update event action
    public void updateEvent(ActionRequest request, ActionResponse response) 
        throws PortletException {
        
        try {
            long eventId = ParamUtil.getLong(request, "eventId");
            String title = ParamUtil.getString(request, "title");
            String description = ParamUtil.getString(request, "description");
            Date eventDate = ParamUtil.getDate(request, "eventDate", new SimpleDateFormat("yyyy-MM-dd"));
            String location = ParamUtil.getString(request, "location");
            int capacity = ParamUtil.getInteger(request, "capacity");

            
            Event event =  _eventLocalService.getEvent(eventId);
            
            _eventLocalService.updateEvent(
                eventId, title, description, eventDate, location, capacity, event.getAvailableSeats());
                 SessionMessages.add(request, "eventUpdated");
          
            response.setRenderParameter("mvcPath", "/view.jsp");
            
        } catch (Exception e) {
            SessionErrors.add(request, e.getClass().getName());
            response.setRenderParameter("mvcPath", "/edit_event.jsp");
        }
    }
    
    // Delete event action
    public void deleteEvent(ActionRequest request, ActionResponse response) 
        throws PortletException {
        
        try {
            long eventId = ParamUtil.getLong(request, "eventId");
            _eventLocalService.deleteEvent(eventId);
            
            SessionMessages.add(request, "eventDeleted");
            
        } catch (Exception e) {
            SessionErrors.add(request, e.getClass().getName());
        }
        
        response.setRenderParameter("mvcPath", "/view.jsp");
    }
    
    @Reference
    private EventLocalService _eventLocalService;
}
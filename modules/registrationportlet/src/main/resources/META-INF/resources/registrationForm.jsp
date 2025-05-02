<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.example.events.service.EventLocalService" %>
<%@ page import="com.example.events.service.EventLocalServiceUtil" %>
<%@ page import="com.example.events.model.Event" %>
<%@ page import="com.example.events.model.Registration" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>

<%
// Retrieve the EventLocalService instance
EventLocalService _eventLocalService = EventLocalServiceUtil.getService();
Date currentDate = new Date();
List<Event> events = _eventLocalService.getUpcomingEvents(currentDate);


long eventId = ParamUtil.getLong(request, "eventId");

//Fetch the event details
Event selected_event = null;

if (eventId > 0) {
	selected_event = EventLocalServiceUtil.fetchEvent(eventId);
}

// If the event does not exist, display an error message and stop processing
if (selected_event == null) {
%>
 <p>The selected event does not exist.</p>
<%
 return;
}
%>

<!-- Registration Form -->
<portlet:actionURL name="registerUser" var="registerUserURL">
</portlet:actionURL>
<!-- Success Messages -->
<liferay-ui:success key="registrationSuccess" message="You have successfully registered for the event!" />
<liferay-ui:error key="registrationError" message="An error occurred while registering for the event." />

<h1>Register for Event: <%= selected_event.getTitle() %></h1>
          
<aui:form action="<%= registerUserURL %>" method="post" name="fm">
   <aui:select name="eventId" label="Select Event">
        <aui:option>-- Select an Event --</aui:option>
        <%
        for (Event event : events) {
        %>
            <aui:option value="<%= event.getEventId() %>" selected="<%= event.getEventId() == eventId %>">
                <%= event.getTitle() %>
            </aui:option>
        <%
        }
        %>
    </aui:select>    
       <aui:input name="username" required="true" />
       <aui:input name="email" type="email" required="true" />
   
   
    <aui:button-row>
        <aui:button type="submit" />
        <aui:button type="cancel" onclick="window.history.back();" />
    </aui:button-row>
</aui:form>
                    

</div>
<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
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

%>
<!-- Registration Form -->
<portlet:actionURL name="registerUser" var="registerUserURL">
</portlet:actionURL>
<!-- Success Messages -->
<liferay-ui:success key="registrationSuccess" message="You have successfully registered for the event!" />
<liferay-ui:error key="registrationError" message="An error occurred while registering for the event." />

<h1>Registration Form</h1>


              
<aui:form action="<%= registerUserURL %>" method="post" name="fm">
   <aui:select name="eventId" label="Select Event">
        <aui:option>-- Select an Event --</aui:option>
        <%
        for (Event event : events) {
        %>
            <aui:option value="<%= event.getEventId() %>" >
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
    </aui:button-row>
</aui:form>
                    

</div>
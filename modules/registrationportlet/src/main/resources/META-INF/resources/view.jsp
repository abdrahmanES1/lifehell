<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.example.events.service.EventLocalService" %>
<%@ page import="com.example.events.service.EventLocalServiceUtil" %>
<%@ page import="com.example.events.model.Event" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%
// Retrieve the EventLocalService instance
EventLocalService _eventLocalService = EventLocalServiceUtil.getService();
Date currentDate = new Date();
List<Event> envets = _eventLocalService.getUpcomingEvents(currentDate);
int count = envets.size();

%>

<!-- Success Messages -->
<liferay-ui:success key="registrationSuccess" message="You have successfully registered for the event!" />
<liferay-ui:error key="registrationError" message="An error occurred while registering for the event." />

<h1>Upcoming Events For Registrations</h1>

<!-- Search Container for Upcoming Events -->
<liferay-ui:search-container emptyResultsMessage="no-events-found" 
    total="<%= count %>">
    
    <liferay-ui:search-container-results 
        results="<%= _eventLocalService.getUpcomingEvents(currentDate) %>" />
    
    <liferay-ui:search-container-row 
        className="com.example.events.model.Event" 
        keyProperty="eventId" modelVar="event">
        
        <!-- Title Column -->
        <liferay-ui:search-container-column-text property="title" />
        
        <!-- Description Column -->
        <liferay-ui:search-container-column-text property="description" />
        
        <!-- Date Column -->
        <liferay-ui:search-container-column-date property="eventDate" />
        
        <!-- Location Column -->
        <liferay-ui:search-container-column-text property="location" />
        
        <!-- Capacity Column -->
        <liferay-ui:search-container-column-text property="capacity" />
        
        <!-- Registration Button Column -->
        <liferay-ui:search-container-column-jsp 
            path="/register_button.jsp" align="right" />
      

    </liferay-ui:search-container-row>
    
    <!-- Pagination -->
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
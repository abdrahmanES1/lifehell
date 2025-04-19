<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.example.events.service.EventLocalService" %>
<%@ page import="com.example.events.service.EventLocalServiceUtil" %>

<%
EventLocalService _eventLocalService = EventLocalServiceUtil.getService();
%>
<portlet:actionURL var="addEventURL" name="addEvent" />
<liferay-ui:success key="eventAdded" message="event-added-successfully" />
<liferay-ui:success key="eventUpdated" message="event-updated-successfully" />
<liferay-ui:success key="eventDeleted" message="event-deleted-successfully" />
<liferay-ui:error />  <!-- Simplified error tag -->

<portlet:renderURL var="addEventURL">
    <portlet:param name="mvcPath" value="/edit_event.jsp" />
</portlet:renderURL>

<aui:button href="<%= addEventURL %>" value="add-event" />

<h1>Events Management</h1>
<liferay-ui:search-container emptyResultsMessage="no-events-found" 
    total="<%= _eventLocalService.getEventsCount() %>">
    
    <liferay-ui:search-container-results 
        results="<%= _eventLocalService.getEvents(
            searchContainer.getStart(), searchContainer.getEnd()) %>" />
    
    <liferay-ui:search-container-row 
        className="com.example.events.model.Event" 
        keyProperty="eventId" modelVar="event">
        
        <liferay-ui:search-container-column-text property="title" />
        <liferay-ui:search-container-column-text property="description" />
        <liferay-ui:search-container-column-date 
            property="eventDate" />
        <liferay-ui:search-container-column-text property="location" />
        <liferay-ui:search-container-column-text property="capacity" />
        
        <liferay-ui:search-container-column-jsp 
            path="/event_actions.jsp" align="right" />
            
    </liferay-ui:search-container-row>
    
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

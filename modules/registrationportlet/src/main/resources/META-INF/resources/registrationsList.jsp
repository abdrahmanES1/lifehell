<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.example.events.service.RegistrationLocalService" %>
<%@ page import="com.example.events.service.RegistrationLocalServiceUtil" %>
<%@ page import="com.example.events.model.Registration" %>
<%@ page import="com.example.events.service.EventLocalService" %>
<%@ page import="com.example.events.service.EventLocalServiceUtil" %>
<%@ page import="com.example.events.model.Event" %>
<%@ page import="com.liferay.portal.kernel.service.UserLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.service.UserLocalService" %>
<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ page import="java.util.List" %>


<%
// Retrieve the RegistrationLocalService instance
RegistrationLocalService _registrationLocalService = RegistrationLocalServiceUtil.getService();
EventLocalService _eventLocalService = EventLocalServiceUtil.getService();
UserLocalService _userLocalService = UserLocalServiceUtil.getService();

//Fetch all events for the dropdown
List<Event> events = _eventLocalService.getEvents(-1, -1);

//Get the selected eventId from the request parameter
long selectedEventId = ParamUtil.getLong(request, "eventId");

//Fetch registrations for the selected event
List<Registration> registrations = null;

if (selectedEventId > 0) {
 registrations = _registrationLocalService.getRegistrationsByEventId(selectedEventId);
 
}else{
	 registrations = _registrationLocalService.getRegistrations(-1, -1);
}

%>

<!-- Success Messages -->
<liferay-ui:success key="registrationAdded" message="registration-added-successfully" />
<liferay-ui:success key="registrationDeleted" message="registration-deleted-successfully" />

<!-- Error Messages -->
<liferay-ui:error key="registrationError" message="an-error-occurred-while-processing-the-registration" />


<h1>Registrations List</h1>
<portlet:renderURL var="formActionURL" />

<aui:form action="<%= formActionURL %>" method="post">

<aui:select name="eventId" label="Select Event" onChange="this.form.submit();">
        <aui:option>-- Select an Event --</aui:option>
        <%
        for (Event event : events) {
        %>
            <aui:option value="<%= event.getEventId() %>"
               selected=" <%= event.getEventId() == selectedEventId %>" >
                <%= event.getTitle() %>
            </aui:option>
        <%
        }
        %>
    </aui:select>
    
</aui:form>
<!-- Search Container for Registrations -->
<liferay-ui:search-container emptyResultsMessage="No Registrations Found" 
    total="<%= _registrationLocalService.getRegistrationsByEventId(selectedEventId).size() %>">
    
    <liferay-ui:search-container-results 
        results="<%= _registrationLocalService.getRegistrationsByEventId(selectedEventId) %>" />
    
    <liferay-ui:search-container-row 
        className="com.example.events.model.Registration" 
        keyProperty="registrationId" modelVar="registration">
        
        <!-- Event ID Column -->
        <liferay-ui:search-container-column-text 
            name="event" 
            value="<%=  _eventLocalService.getEvent(registration.getEventId()).getTitle()  %>" />
        
        <!-- Registration Date Column -->
        <liferay-ui:search-container-column-text 
            name="username" 
            property="username" />
            
            
       <!-- Registration Date Column -->
        <liferay-ui:search-container-column-text 
            name="username" 
            property="email" />
            
        <!-- Registration Date Column -->
        <liferay-ui:search-container-column-date 
            name="Registration Date" 
            property="createDate" />
        
            
    </liferay-ui:search-container-row>
    
    <!-- Pagination -->
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<%@ include file="/init.jsp" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchContainer" %>
<%@ page import="com.example.events.service.RegistrationLocalService" %>
<%@ page import="com.example.events.service.RegistrationLocalServiceUtil" %>
<%@ page import="com.example.events.model.Registration" %>

<%
// Retrieve the RegistrationLocalService instance
RegistrationLocalService _registrationLocalService = RegistrationLocalServiceUtil.getService();

%>

<!-- Success Messages -->
<liferay-ui:success key="registrationAdded" message="registration-added-successfully" />
<liferay-ui:success key="registrationDeleted" message="registration-deleted-successfully" />

<!-- Error Messages -->
<liferay-ui:error key="registrationError" message="an-error-occurred-while-processing-the-registration" />

<h1>Registrations List</h1>
<!-- Search Container for Registrations -->
<liferay-ui:search-container emptyResultsMessage="no-registrations-found" 
    total="<%= _registrationLocalService.getRegistrationsCount() %>">
    
    <liferay-ui:search-container-results 
        results="<%= _registrationLocalService.getRegistrations(
            searchContainer.getStart(), searchContainer.getEnd()) %>" />
    
    <liferay-ui:search-container-row 
        className="com.example.events.model.Registration" 
        keyProperty="registrationId" modelVar="registration">
        
        <!-- Event ID Column -->
        <liferay-ui:search-container-column-text 
            name="event-id" 
            value="<%= String.valueOf(registration.getEventId()) %>" />
        
        <!-- User ID Column -->
        <liferay-ui:search-container-column-text 
            name="user-id" 
            value="<%= String.valueOf(registration.getUserId()) %>" />
        
        <!-- Registration Date Column -->
        <liferay-ui:search-container-column-date 
            name="registration-date" 
            property="createDate" />
        

            
    </liferay-ui:search-container-row>
    
    <!-- Pagination -->
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

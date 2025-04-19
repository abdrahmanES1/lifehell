<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="com.example.events.service.EventLocalService" %>
<%@ page import="com.example.events.model.Event" %>
<%@ page import="com.example.events.service.EventLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%
EventLocalService _eventLocalService = EventLocalServiceUtil.getService();

// Get parameters
long eventId = ParamUtil.getLong(request, "eventId");
Event event = null;

if (eventId > 0) {
    event = _eventLocalService.getEvent(eventId);
}

%>
<portlet:actionURL name="registerUser" var="registerUserURL">
    <portlet:param name="eventId" value="<%= String.valueOf(event.getEventId()) %>" />
    <portlet:param name="userId" value="<%= String.valueOf(themeDisplay.getUserId()) %>" />
</portlet:actionURL>

<aui:button value="Register" onClick="<%= registerUserURL.toString() %>" cssClass="btn btn-primary" />
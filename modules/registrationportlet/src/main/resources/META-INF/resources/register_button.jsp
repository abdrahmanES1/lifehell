<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="com.example.events.service.EventLocalService" %>
<%@ page import="com.example.events.model.Event" %>
<%@ page import="com.example.events.service.EventLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@ page import="com.example.events.model.Event" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.petra.string.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.taglib.search.ResultRow" %>

<%
// Safely get the event object with multiple fallback approaches
Event event = null;

// Approach 1: From SEARCH_CONTAINER_RESULT_ROW attribute
Object rowObj = request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
if (rowObj instanceof ResultRow) {
    ResultRow row = (ResultRow)rowObj;
    event = (Event)row.getObject();
}
// Approach 2: Direct model attribute (if using modelVar)
else if (request.getAttribute("event") != null) {
    event = (Event)request.getAttribute("event");
}

if (event == null) {
    return;
}

%>
<portlet:actionURL name="registerUser" var="registerUserURL">
    <portlet:param name="eventId" value="<%= String.valueOf(event.getEventId()) %>" />
</portlet:actionURL>

<aui:button value="Register" onClick="<%= registerUserURL.toString() %>" cssClass="btn btn-primary" />
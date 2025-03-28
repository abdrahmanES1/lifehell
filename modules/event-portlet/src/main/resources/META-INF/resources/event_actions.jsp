<%@ include file="/init.jsp" %>
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

String currentURL = PortalUtil.getCurrentURL(request);
%>

<div class="event-actions-container">
    <liferay-ui:icon-menu 
        direction="left-side" 
        icon="<%= StringPool.BLANK %>" 
        message="actions" 
        showWhenSingleIcon="true">

        <portlet:renderURL var="editURL">
            <portlet:param name="mvcPath" value="/edit_event.jsp" />
            <portlet:param name="eventId" value="<%= String.valueOf(event.getEventId()) %>" />
            <portlet:param name="backURL" value="<%= currentURL %>" />
        </portlet:renderURL>

        <liferay-ui:icon message="edit" url="<%= editURL %>" />

        <portlet:actionURL name="deleteEvent" var="deleteURL">
            <portlet:param name="eventId" value="<%= String.valueOf(event.getEventId()) %>" />
            <portlet:param name="redirect" value="<%= currentURL %>" />
        </portlet:actionURL>

        <liferay-ui:icon-delete url="<%= deleteURL %>" />

    </liferay-ui:icon-menu>
</div>

<style>
.event-actions-container {
    position: relative;
    display: inline-block;
}
</style>
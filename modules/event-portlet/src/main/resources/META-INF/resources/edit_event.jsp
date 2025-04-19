<%@ include file="/init.jsp" %>
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

<portlet:actionURL name="<%= event == null ? "addEvent" : "updateEvent" %>" var="editEventURL" />

<aui:form action="<%= editEventURL %>" method="post" name="fm">
    <aui:model-context bean="<%= event %>" model="<%= Event.class %>" />
    
    <aui:input name="eventId" type="hidden" />
    <aui:input name="redirect" type="hidden" value="<%= ParamUtil.getString(request, "backURL") %>" />
    
    <aui:fieldset>
        <aui:input name="title" required="true" />
        <aui:input name="description" type="textarea" required="true" />
        <aui:input name="eventDate" type="date" required="true"
            value='<%= event != null ? 
                new SimpleDateFormat("yyyy-MM-dd").format(event.getEventDate()) : "" %>' />
        <aui:input name="location" required="true"/>
        <aui:input name="capacity" type="number" min="1" required="true"/>
        
    </aui:fieldset>
    
    <aui:button-row>
        <aui:button type="submit" />
        <aui:button type="cancel" href="<%= ParamUtil.getString(request, "backURL") %>" />
    </aui:button-row>
</aui:form>
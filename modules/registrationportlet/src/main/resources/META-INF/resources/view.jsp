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
Registration registration = null;

%>

<h1>Upcoming Events</h1>

<!-- Grid Layout for Cards -->
<div class="row">
    <%
    for (Event event : events) {
    %>
        <div class="col-md-4 mb-4 m-3">
            <div class="card">
                <div class="card-body">
                    <!-- Event Title -->
                    <h3 class="card-title"><%= event.getTitle() %></h5>

                    <!-- Event Description -->
                    <p class="card-text"><%= event.getDescription() %></p>

                    <!-- Event Details -->
                    <ul class="list-unstyled">
                        <li><strong>Date:</strong> <%= event.getEventDate() %></li>
                        <li><strong>Location:</strong> <%= event.getLocation() %></li>
                        <li><strong>Capacity:</strong> <%= event.getCapacity() %></li>
                        <li><strong>Available Seats:</strong> <%= event.getAvailableSeats() %></li>
                    </ul>
                    <!-- Bouton pour Acc�der au Formulaire d'Inscription -->
                    <portlet:renderURL var="registerFormURL">
                        <portlet:param name="mvcPath" value="/registrationForm.jsp" />
                        <portlet:param name="eventId" value="<%= String.valueOf(event.getEventId()) %>" />
                    </portlet:renderURL>
                    
                    <a href="<%= registerFormURL %>" class="btn btn-primary btn-block">Registration</a>

                    
             		
                </div>
      
                
                

                  
      
                
            </div>
            
            
        </div>
    <%
    }
    %>
</div>
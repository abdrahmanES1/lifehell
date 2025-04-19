/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.impl;

import com.example.events.service.base.EventLocalServiceBaseImpl;
import com.example.events.model.Event;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;
import java.util.Date;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.example.events.model.Event",
	service = AopService.class
)
public class EventLocalServiceImpl extends EventLocalServiceBaseImpl {
	
	public Event addEvent(String title, String description, Date eventDate, String location, int capacity) {
        long eventId = counterLocalService.increment();
        Event event = eventPersistence.create(eventId);
    
        event.setTitle(title);
        event.setDescription(description);
        event.setEventDate(eventDate);
        event.setLocation(location);
        event.setCapacity(capacity);
        
        // init the available seats
        event.setAvailableSeats(capacity);
    
        return eventPersistence.update(event);
    }
    
    public Event updateEvent(
            long eventId, String title, String description, Date eventDate,
            String location, int capacity, int availableSeats)
        throws PortalException {
        
        // Validate input
        validate(title, eventDate, capacity, location, availableSeats);
        
        // Get existing event
        Event event = getEvent(eventId);
        
        // Update fields
        event.setTitle(title);
        event.setDescription(description);
        event.setEventDate(eventDate);
        event.setLocation(location);
        event.setCapacity(capacity);
        event.setAvailableSeats(availableSeats);
        
        // Update and return
        return super.updateEvent(event);
    }
    
    private void validate(String title, Date eventDate, int capacity, String location, int availableSeats) 
        throws PortalException {
        
        if (title == null) {
            throw new PortalException("Event title cannot be empty");
        }
        
        if (eventDate == null) {
            throw new PortalException("Event date is required");
        }
        
        if (eventDate.before(new Date())) {
            throw new PortalException("Event date cannot be in the past");
        }
        
        if (location == null) {
            throw new PortalException("Event Location cannot be empty");
        }
        
        if (capacity <= 0) {
            throw new PortalException("Capacity must be positive");
        }
        
        if (availableSeats <= 0) {
            throw new PortalException("Available Seats must be positive");
        }
        
    }
    
    // Custom finder implementation
    public List<Event> findByDate(Date eventDate, int start, int end) {
        return eventPersistence.findByByDate(eventDate, start, end);
    }
    
    public int findByDateCount(Date eventDate) {
       return  eventPersistence.countByByDate(eventDate);
    }
    
 // Get upcoming events
    public List<Event> getUpcomingEvents(Date currentDate) {
    	List<Event> events = eventPersistence.findAll();

        // Filter events where eventDateTime > currentDate
        return events.stream()
            .filter(event -> event.getEventDate().after(currentDate))
            .toList();
    }
	
	
}
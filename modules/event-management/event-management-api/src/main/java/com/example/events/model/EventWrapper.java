/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Event}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Event
 * @generated
 */
public class EventWrapper
	extends BaseModelWrapper<Event> implements Event, ModelWrapper<Event> {

	public EventWrapper(Event event) {
		super(event);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eventId", getEventId());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("eventDate", getEventDate());
		attributes.put("location", getLocation());
		attributes.put("capacity", getCapacity());
		attributes.put("availableSeats", getAvailableSeats());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date eventDate = (Date)attributes.get("eventDate");

		if (eventDate != null) {
			setEventDate(eventDate);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Integer capacity = (Integer)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		Integer availableSeats = (Integer)attributes.get("availableSeats");

		if (availableSeats != null) {
			setAvailableSeats(availableSeats);
		}
	}

	@Override
	public Event cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the available seats of this event.
	 *
	 * @return the available seats of this event
	 */
	@Override
	public int getAvailableSeats() {
		return model.getAvailableSeats();
	}

	/**
	 * Returns the capacity of this event.
	 *
	 * @return the capacity of this event
	 */
	@Override
	public int getCapacity() {
		return model.getCapacity();
	}

	/**
	 * Returns the description of this event.
	 *
	 * @return the description of this event
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the event date of this event.
	 *
	 * @return the event date of this event
	 */
	@Override
	public Date getEventDate() {
		return model.getEventDate();
	}

	/**
	 * Returns the event ID of this event.
	 *
	 * @return the event ID of this event
	 */
	@Override
	public long getEventId() {
		return model.getEventId();
	}

	/**
	 * Returns the location of this event.
	 *
	 * @return the location of this event
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the primary key of this event.
	 *
	 * @return the primary key of this event
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this event.
	 *
	 * @return the title of this event
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the available seats of this event.
	 *
	 * @param availableSeats the available seats of this event
	 */
	@Override
	public void setAvailableSeats(int availableSeats) {
		model.setAvailableSeats(availableSeats);
	}

	/**
	 * Sets the capacity of this event.
	 *
	 * @param capacity the capacity of this event
	 */
	@Override
	public void setCapacity(int capacity) {
		model.setCapacity(capacity);
	}

	/**
	 * Sets the description of this event.
	 *
	 * @param description the description of this event
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the event date of this event.
	 *
	 * @param eventDate the event date of this event
	 */
	@Override
	public void setEventDate(Date eventDate) {
		model.setEventDate(eventDate);
	}

	/**
	 * Sets the event ID of this event.
	 *
	 * @param eventId the event ID of this event
	 */
	@Override
	public void setEventId(long eventId) {
		model.setEventId(eventId);
	}

	/**
	 * Sets the location of this event.
	 *
	 * @param location the location of this event
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the primary key of this event.
	 *
	 * @param primaryKey the primary key of this event
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this event.
	 *
	 * @param title the title of this event
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected EventWrapper wrap(Event event) {
		return new EventWrapper(event);
	}

}
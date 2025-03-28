/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.model.impl;

import com.example.events.model.Event;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Event in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EventCacheModel implements CacheModel<Event>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EventCacheModel)) {
			return false;
		}

		EventCacheModel eventCacheModel = (EventCacheModel)object;

		if (eventId == eventCacheModel.eventId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, eventId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{eventId=");
		sb.append(eventId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", eventDate=");
		sb.append(eventDate);
		sb.append(", location=");
		sb.append(location);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Event toEntityModel() {
		EventImpl eventImpl = new EventImpl();

		eventImpl.setEventId(eventId);

		if (title == null) {
			eventImpl.setTitle("");
		}
		else {
			eventImpl.setTitle(title);
		}

		if (description == null) {
			eventImpl.setDescription("");
		}
		else {
			eventImpl.setDescription(description);
		}

		if (eventDate == Long.MIN_VALUE) {
			eventImpl.setEventDate(null);
		}
		else {
			eventImpl.setEventDate(new Date(eventDate));
		}

		if (location == null) {
			eventImpl.setLocation("");
		}
		else {
			eventImpl.setLocation(location);
		}

		eventImpl.setCapacity(capacity);

		eventImpl.resetOriginalValues();

		return eventImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eventId = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		eventDate = objectInput.readLong();
		location = objectInput.readUTF();

		capacity = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(eventId);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(eventDate);

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		objectOutput.writeInt(capacity);
	}

	public long eventId;
	public String title;
	public String description;
	public long eventDate;
	public String location;
	public int capacity;

}
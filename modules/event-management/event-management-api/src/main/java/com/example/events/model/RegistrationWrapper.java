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
 * This class is a wrapper for {@link Registration}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Registration
 * @generated
 */
public class RegistrationWrapper
	extends BaseModelWrapper<Registration>
	implements ModelWrapper<Registration>, Registration {

	public RegistrationWrapper(Registration registration) {
		super(registration);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("registrationId", getRegistrationId());
		attributes.put("eventId", getEventId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long registrationId = (Long)attributes.get("registrationId");

		if (registrationId != null) {
			setRegistrationId(registrationId);
		}

		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@Override
	public Registration cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the create date of this registration.
	 *
	 * @return the create date of this registration
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the event ID of this registration.
	 *
	 * @return the event ID of this registration
	 */
	@Override
	public long getEventId() {
		return model.getEventId();
	}

	/**
	 * Returns the primary key of this registration.
	 *
	 * @return the primary key of this registration
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registration ID of this registration.
	 *
	 * @return the registration ID of this registration
	 */
	@Override
	public long getRegistrationId() {
		return model.getRegistrationId();
	}

	/**
	 * Returns the user ID of this registration.
	 *
	 * @return the user ID of this registration
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user uuid of this registration.
	 *
	 * @return the user uuid of this registration
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the create date of this registration.
	 *
	 * @param createDate the create date of this registration
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the event ID of this registration.
	 *
	 * @param eventId the event ID of this registration
	 */
	@Override
	public void setEventId(long eventId) {
		model.setEventId(eventId);
	}

	/**
	 * Sets the primary key of this registration.
	 *
	 * @param primaryKey the primary key of this registration
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registration ID of this registration.
	 *
	 * @param registrationId the registration ID of this registration
	 */
	@Override
	public void setRegistrationId(long registrationId) {
		model.setRegistrationId(registrationId);
	}

	/**
	 * Sets the user ID of this registration.
	 *
	 * @param userId the user ID of this registration
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user uuid of this registration.
	 *
	 * @param userUuid the user uuid of this registration
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected RegistrationWrapper wrap(Registration registration) {
		return new RegistrationWrapper(registration);
	}

}
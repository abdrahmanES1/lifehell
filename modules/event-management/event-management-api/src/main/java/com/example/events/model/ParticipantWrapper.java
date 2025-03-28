/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Participant}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Participant
 * @generated
 */
public class ParticipantWrapper
	extends BaseModelWrapper<Participant>
	implements ModelWrapper<Participant>, Participant {

	public ParticipantWrapper(Participant participant) {
		super(participant);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("participantId", getParticipantId());
		attributes.put("eventId", getEventId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long participantId = (Long)attributes.get("participantId");

		if (participantId != null) {
			setParticipantId(participantId);
		}

		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	@Override
	public Participant cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the email of this participant.
	 *
	 * @return the email of this participant
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the event ID of this participant.
	 *
	 * @return the event ID of this participant
	 */
	@Override
	public long getEventId() {
		return model.getEventId();
	}

	/**
	 * Returns the name of this participant.
	 *
	 * @return the name of this participant
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the participant ID of this participant.
	 *
	 * @return the participant ID of this participant
	 */
	@Override
	public long getParticipantId() {
		return model.getParticipantId();
	}

	/**
	 * Returns the primary key of this participant.
	 *
	 * @return the primary key of this participant
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the email of this participant.
	 *
	 * @param email the email of this participant
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the event ID of this participant.
	 *
	 * @param eventId the event ID of this participant
	 */
	@Override
	public void setEventId(long eventId) {
		model.setEventId(eventId);
	}

	/**
	 * Sets the name of this participant.
	 *
	 * @param name the name of this participant
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the participant ID of this participant.
	 *
	 * @param participantId the participant ID of this participant
	 */
	@Override
	public void setParticipantId(long participantId) {
		model.setParticipantId(participantId);
	}

	/**
	 * Sets the primary key of this participant.
	 *
	 * @param primaryKey the primary key of this participant
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected ParticipantWrapper wrap(Participant participant) {
		return new ParticipantWrapper(participant);
	}

}
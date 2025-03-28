/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.model.impl;

import com.example.events.model.Participant;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Participant in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ParticipantCacheModel
	implements CacheModel<Participant>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ParticipantCacheModel)) {
			return false;
		}

		ParticipantCacheModel participantCacheModel =
			(ParticipantCacheModel)object;

		if (participantId == participantCacheModel.participantId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, participantId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{participantId=");
		sb.append(participantId);
		sb.append(", eventId=");
		sb.append(eventId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email=");
		sb.append(email);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Participant toEntityModel() {
		ParticipantImpl participantImpl = new ParticipantImpl();

		participantImpl.setParticipantId(participantId);
		participantImpl.setEventId(eventId);

		if (name == null) {
			participantImpl.setName("");
		}
		else {
			participantImpl.setName(name);
		}

		if (email == null) {
			participantImpl.setEmail("");
		}
		else {
			participantImpl.setEmail(email);
		}

		participantImpl.resetOriginalValues();

		return participantImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		participantId = objectInput.readLong();

		eventId = objectInput.readLong();
		name = objectInput.readUTF();
		email = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(participantId);

		objectOutput.writeLong(eventId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}
	}

	public long participantId;
	public long eventId;
	public String name;
	public String email;

}
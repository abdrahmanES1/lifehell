/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ParticipantService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantService
 * @generated
 */
public class ParticipantServiceWrapper
	implements ParticipantService, ServiceWrapper<ParticipantService> {

	public ParticipantServiceWrapper() {
		this(null);
	}

	public ParticipantServiceWrapper(ParticipantService participantService) {
		_participantService = participantService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _participantService.getOSGiServiceIdentifier();
	}

	@Override
	public ParticipantService getWrappedService() {
		return _participantService;
	}

	@Override
	public void setWrappedService(ParticipantService participantService) {
		_participantService = participantService;
	}

	private ParticipantService _participantService;

}
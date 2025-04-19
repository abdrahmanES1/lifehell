/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegistrationService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationService
 * @generated
 */
public class RegistrationServiceWrapper
	implements RegistrationService, ServiceWrapper<RegistrationService> {

	public RegistrationServiceWrapper() {
		this(null);
	}

	public RegistrationServiceWrapper(RegistrationService registrationService) {
		_registrationService = registrationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _registrationService.getOSGiServiceIdentifier();
	}

	@Override
	public RegistrationService getWrappedService() {
		return _registrationService;
	}

	@Override
	public void setWrappedService(RegistrationService registrationService) {
		_registrationService = registrationService;
	}

	private RegistrationService _registrationService;

}
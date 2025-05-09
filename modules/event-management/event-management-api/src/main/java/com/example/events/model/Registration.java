/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Registration service. Represents a row in the &quot;Event_Registration&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationModel
 * @generated
 */
@ImplementationClassName("com.example.events.model.impl.RegistrationImpl")
@ProviderType
public interface Registration extends PersistedModel, RegistrationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.example.events.model.impl.RegistrationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Registration, Long> REGISTRATION_ID_ACCESSOR =
		new Accessor<Registration, Long>() {

			@Override
			public Long get(Registration registration) {
				return registration.getRegistrationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Registration> getTypeClass() {
				return Registration.class;
			}

		};

}
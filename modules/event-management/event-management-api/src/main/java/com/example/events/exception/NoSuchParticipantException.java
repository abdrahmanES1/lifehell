/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.example.events.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchParticipantException extends NoSuchModelException {

	public NoSuchParticipantException() {
	}

	public NoSuchParticipantException(String msg) {
		super(msg);
	}

	public NoSuchParticipantException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchParticipantException(Throwable throwable) {
		super(throwable);
	}

}
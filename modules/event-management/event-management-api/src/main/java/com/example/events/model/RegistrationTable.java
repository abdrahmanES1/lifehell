/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Event_Registration&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Registration
 * @generated
 */
public class RegistrationTable extends BaseTable<RegistrationTable> {

	public static final RegistrationTable INSTANCE = new RegistrationTable();

	public final Column<RegistrationTable, Long> registrationId = createColumn(
		"registrationId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RegistrationTable, Long> eventId = createColumn(
		"eventId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<RegistrationTable, String> username = createColumn(
		"username", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RegistrationTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RegistrationTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);

	private RegistrationTable() {
		super("Event_Registration", RegistrationTable::new);
	}

}
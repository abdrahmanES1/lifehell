/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Event_Participant&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Participant
 * @generated
 */
public class ParticipantTable extends BaseTable<ParticipantTable> {

	public static final ParticipantTable INSTANCE = new ParticipantTable();

	public final Column<ParticipantTable, Long> participantId = createColumn(
		"participantId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ParticipantTable, Long> eventId = createColumn(
		"eventId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ParticipantTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ParticipantTable, String> email = createColumn(
		"email", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ParticipantTable() {
		super("Event_Participant", ParticipantTable::new);
	}

}
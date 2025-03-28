/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.persistence;

import com.example.events.exception.NoSuchParticipantException;
import com.example.events.model.Participant;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the participant service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantUtil
 * @generated
 */
@ProviderType
public interface ParticipantPersistence extends BasePersistence<Participant> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ParticipantUtil} to access the participant persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the participant in the entity cache if it is enabled.
	 *
	 * @param participant the participant
	 */
	public void cacheResult(Participant participant);

	/**
	 * Caches the participants in the entity cache if it is enabled.
	 *
	 * @param participants the participants
	 */
	public void cacheResult(java.util.List<Participant> participants);

	/**
	 * Creates a new participant with the primary key. Does not add the participant to the database.
	 *
	 * @param participantId the primary key for the new participant
	 * @return the new participant
	 */
	public Participant create(long participantId);

	/**
	 * Removes the participant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participantId the primary key of the participant
	 * @return the participant that was removed
	 * @throws NoSuchParticipantException if a participant with the primary key could not be found
	 */
	public Participant remove(long participantId)
		throws NoSuchParticipantException;

	public Participant updateImpl(Participant participant);

	/**
	 * Returns the participant with the primary key or throws a <code>NoSuchParticipantException</code> if it could not be found.
	 *
	 * @param participantId the primary key of the participant
	 * @return the participant
	 * @throws NoSuchParticipantException if a participant with the primary key could not be found
	 */
	public Participant findByPrimaryKey(long participantId)
		throws NoSuchParticipantException;

	/**
	 * Returns the participant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param participantId the primary key of the participant
	 * @return the participant, or <code>null</code> if a participant with the primary key could not be found
	 */
	public Participant fetchByPrimaryKey(long participantId);

	/**
	 * Returns all the participants.
	 *
	 * @return the participants
	 */
	public java.util.List<Participant> findAll();

	/**
	 * Returns a range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @return the range of participants
	 */
	public java.util.List<Participant> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of participants
	 */
	public java.util.List<Participant> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator);

	/**
	 * Returns an ordered range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of participants
	 */
	public java.util.List<Participant> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Participant>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the participants from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of participants.
	 *
	 * @return the number of participants
	 */
	public int countAll();

}
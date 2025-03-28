/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.persistence;

import com.example.events.model.Participant;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the participant service. This utility wraps <code>com.example.events.service.persistence.impl.ParticipantPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantPersistence
 * @generated
 */
public class ParticipantUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Participant participant) {
		getPersistence().clearCache(participant);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Participant> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Participant> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Participant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Participant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Participant> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Participant update(Participant participant) {
		return getPersistence().update(participant);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Participant update(
		Participant participant, ServiceContext serviceContext) {

		return getPersistence().update(participant, serviceContext);
	}

	/**
	 * Caches the participant in the entity cache if it is enabled.
	 *
	 * @param participant the participant
	 */
	public static void cacheResult(Participant participant) {
		getPersistence().cacheResult(participant);
	}

	/**
	 * Caches the participants in the entity cache if it is enabled.
	 *
	 * @param participants the participants
	 */
	public static void cacheResult(List<Participant> participants) {
		getPersistence().cacheResult(participants);
	}

	/**
	 * Creates a new participant with the primary key. Does not add the participant to the database.
	 *
	 * @param participantId the primary key for the new participant
	 * @return the new participant
	 */
	public static Participant create(long participantId) {
		return getPersistence().create(participantId);
	}

	/**
	 * Removes the participant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param participantId the primary key of the participant
	 * @return the participant that was removed
	 * @throws NoSuchParticipantException if a participant with the primary key could not be found
	 */
	public static Participant remove(long participantId)
		throws com.example.events.exception.NoSuchParticipantException {

		return getPersistence().remove(participantId);
	}

	public static Participant updateImpl(Participant participant) {
		return getPersistence().updateImpl(participant);
	}

	/**
	 * Returns the participant with the primary key or throws a <code>NoSuchParticipantException</code> if it could not be found.
	 *
	 * @param participantId the primary key of the participant
	 * @return the participant
	 * @throws NoSuchParticipantException if a participant with the primary key could not be found
	 */
	public static Participant findByPrimaryKey(long participantId)
		throws com.example.events.exception.NoSuchParticipantException {

		return getPersistence().findByPrimaryKey(participantId);
	}

	/**
	 * Returns the participant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param participantId the primary key of the participant
	 * @return the participant, or <code>null</code> if a participant with the primary key could not be found
	 */
	public static Participant fetchByPrimaryKey(long participantId) {
		return getPersistence().fetchByPrimaryKey(participantId);
	}

	/**
	 * Returns all the participants.
	 *
	 * @return the participants
	 */
	public static List<Participant> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<Participant> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<Participant> findAll(
		int start, int end, OrderByComparator<Participant> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<Participant> findAll(
		int start, int end, OrderByComparator<Participant> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the participants from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of participants.
	 *
	 * @return the number of participants
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ParticipantPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ParticipantPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ParticipantPersistence _persistence;

}
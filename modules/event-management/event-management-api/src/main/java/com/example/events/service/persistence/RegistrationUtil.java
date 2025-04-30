/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.persistence;

import com.example.events.model.Registration;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the registration service. This utility wraps <code>com.example.events.service.persistence.impl.RegistrationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationPersistence
 * @generated
 */
public class RegistrationUtil {

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
	public static void clearCache(Registration registration) {
		getPersistence().clearCache(registration);
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
	public static Map<Serializable, Registration> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Registration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Registration> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Registration update(Registration registration) {
		return getPersistence().update(registration);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Registration update(
		Registration registration, ServiceContext serviceContext) {

		return getPersistence().update(registration, serviceContext);
	}

	/**
	 * Returns all the registrations where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @return the matching registrations
	 */
	public static List<Registration> findByEventId(long eventId) {
		return getPersistence().findByEventId(eventId);
	}

	/**
	 * Returns a range of all the registrations where eventId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param eventId the event ID
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @return the range of matching registrations
	 */
	public static List<Registration> findByEventId(
		long eventId, int start, int end) {

		return getPersistence().findByEventId(eventId, start, end);
	}

	/**
	 * Returns an ordered range of all the registrations where eventId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param eventId the event ID
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registrations
	 */
	public static List<Registration> findByEventId(
		long eventId, int start, int end,
		OrderByComparator<Registration> orderByComparator) {

		return getPersistence().findByEventId(
			eventId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the registrations where eventId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param eventId the event ID
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching registrations
	 */
	public static List<Registration> findByEventId(
		long eventId, int start, int end,
		OrderByComparator<Registration> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByEventId(
			eventId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first registration in the ordered set where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public static Registration findByEventId_First(
			long eventId, OrderByComparator<Registration> orderByComparator)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().findByEventId_First(eventId, orderByComparator);
	}

	/**
	 * Returns the first registration in the ordered set where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public static Registration fetchByEventId_First(
		long eventId, OrderByComparator<Registration> orderByComparator) {

		return getPersistence().fetchByEventId_First(
			eventId, orderByComparator);
	}

	/**
	 * Returns the last registration in the ordered set where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public static Registration findByEventId_Last(
			long eventId, OrderByComparator<Registration> orderByComparator)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().findByEventId_Last(eventId, orderByComparator);
	}

	/**
	 * Returns the last registration in the ordered set where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public static Registration fetchByEventId_Last(
		long eventId, OrderByComparator<Registration> orderByComparator) {

		return getPersistence().fetchByEventId_Last(eventId, orderByComparator);
	}

	/**
	 * Returns the registrations before and after the current registration in the ordered set where eventId = &#63;.
	 *
	 * @param registrationId the primary key of the current registration
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration
	 * @throws NoSuchRegistrationException if a registration with the primary key could not be found
	 */
	public static Registration[] findByEventId_PrevAndNext(
			long registrationId, long eventId,
			OrderByComparator<Registration> orderByComparator)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().findByEventId_PrevAndNext(
			registrationId, eventId, orderByComparator);
	}

	/**
	 * Removes all the registrations where eventId = &#63; from the database.
	 *
	 * @param eventId the event ID
	 */
	public static void removeByEventId(long eventId) {
		getPersistence().removeByEventId(eventId);
	}

	/**
	 * Returns the number of registrations where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @return the number of matching registrations
	 */
	public static int countByEventId(long eventId) {
		return getPersistence().countByEventId(eventId);
	}

	/**
	 * Returns all the registrations where username = &#63;.
	 *
	 * @param username the username
	 * @return the matching registrations
	 */
	public static List<Registration> findByUsername(String username) {
		return getPersistence().findByUsername(username);
	}

	/**
	 * Returns a range of all the registrations where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @return the range of matching registrations
	 */
	public static List<Registration> findByUsername(
		String username, int start, int end) {

		return getPersistence().findByUsername(username, start, end);
	}

	/**
	 * Returns an ordered range of all the registrations where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registrations
	 */
	public static List<Registration> findByUsername(
		String username, int start, int end,
		OrderByComparator<Registration> orderByComparator) {

		return getPersistence().findByUsername(
			username, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the registrations where username = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param username the username
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching registrations
	 */
	public static List<Registration> findByUsername(
		String username, int start, int end,
		OrderByComparator<Registration> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUsername(
			username, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first registration in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public static Registration findByUsername_First(
			String username, OrderByComparator<Registration> orderByComparator)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().findByUsername_First(
			username, orderByComparator);
	}

	/**
	 * Returns the first registration in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public static Registration fetchByUsername_First(
		String username, OrderByComparator<Registration> orderByComparator) {

		return getPersistence().fetchByUsername_First(
			username, orderByComparator);
	}

	/**
	 * Returns the last registration in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public static Registration findByUsername_Last(
			String username, OrderByComparator<Registration> orderByComparator)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().findByUsername_Last(
			username, orderByComparator);
	}

	/**
	 * Returns the last registration in the ordered set where username = &#63;.
	 *
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public static Registration fetchByUsername_Last(
		String username, OrderByComparator<Registration> orderByComparator) {

		return getPersistence().fetchByUsername_Last(
			username, orderByComparator);
	}

	/**
	 * Returns the registrations before and after the current registration in the ordered set where username = &#63;.
	 *
	 * @param registrationId the primary key of the current registration
	 * @param username the username
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration
	 * @throws NoSuchRegistrationException if a registration with the primary key could not be found
	 */
	public static Registration[] findByUsername_PrevAndNext(
			long registrationId, String username,
			OrderByComparator<Registration> orderByComparator)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().findByUsername_PrevAndNext(
			registrationId, username, orderByComparator);
	}

	/**
	 * Removes all the registrations where username = &#63; from the database.
	 *
	 * @param username the username
	 */
	public static void removeByUsername(String username) {
		getPersistence().removeByUsername(username);
	}

	/**
	 * Returns the number of registrations where username = &#63;.
	 *
	 * @param username the username
	 * @return the number of matching registrations
	 */
	public static int countByUsername(String username) {
		return getPersistence().countByUsername(username);
	}

	/**
	 * Returns the registration where eventId = &#63; and username = &#63; or throws a <code>NoSuchRegistrationException</code> if it could not be found.
	 *
	 * @param eventId the event ID
	 * @param username the username
	 * @return the matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public static Registration findByEventId_Username(
			long eventId, String username)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().findByEventId_Username(eventId, username);
	}

	/**
	 * Returns the registration where eventId = &#63; and username = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param eventId the event ID
	 * @param username the username
	 * @return the matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public static Registration fetchByEventId_Username(
		long eventId, String username) {

		return getPersistence().fetchByEventId_Username(eventId, username);
	}

	/**
	 * Returns the registration where eventId = &#63; and username = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param eventId the event ID
	 * @param username the username
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public static Registration fetchByEventId_Username(
		long eventId, String username, boolean useFinderCache) {

		return getPersistence().fetchByEventId_Username(
			eventId, username, useFinderCache);
	}

	/**
	 * Removes the registration where eventId = &#63; and username = &#63; from the database.
	 *
	 * @param eventId the event ID
	 * @param username the username
	 * @return the registration that was removed
	 */
	public static Registration removeByEventId_Username(
			long eventId, String username)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().removeByEventId_Username(eventId, username);
	}

	/**
	 * Returns the number of registrations where eventId = &#63; and username = &#63;.
	 *
	 * @param eventId the event ID
	 * @param username the username
	 * @return the number of matching registrations
	 */
	public static int countByEventId_Username(long eventId, String username) {
		return getPersistence().countByEventId_Username(eventId, username);
	}

	/**
	 * Caches the registration in the entity cache if it is enabled.
	 *
	 * @param registration the registration
	 */
	public static void cacheResult(Registration registration) {
		getPersistence().cacheResult(registration);
	}

	/**
	 * Caches the registrations in the entity cache if it is enabled.
	 *
	 * @param registrations the registrations
	 */
	public static void cacheResult(List<Registration> registrations) {
		getPersistence().cacheResult(registrations);
	}

	/**
	 * Creates a new registration with the primary key. Does not add the registration to the database.
	 *
	 * @param registrationId the primary key for the new registration
	 * @return the new registration
	 */
	public static Registration create(long registrationId) {
		return getPersistence().create(registrationId);
	}

	/**
	 * Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrationId the primary key of the registration
	 * @return the registration that was removed
	 * @throws NoSuchRegistrationException if a registration with the primary key could not be found
	 */
	public static Registration remove(long registrationId)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().remove(registrationId);
	}

	public static Registration updateImpl(Registration registration) {
		return getPersistence().updateImpl(registration);
	}

	/**
	 * Returns the registration with the primary key or throws a <code>NoSuchRegistrationException</code> if it could not be found.
	 *
	 * @param registrationId the primary key of the registration
	 * @return the registration
	 * @throws NoSuchRegistrationException if a registration with the primary key could not be found
	 */
	public static Registration findByPrimaryKey(long registrationId)
		throws com.example.events.exception.NoSuchRegistrationException {

		return getPersistence().findByPrimaryKey(registrationId);
	}

	/**
	 * Returns the registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param registrationId the primary key of the registration
	 * @return the registration, or <code>null</code> if a registration with the primary key could not be found
	 */
	public static Registration fetchByPrimaryKey(long registrationId) {
		return getPersistence().fetchByPrimaryKey(registrationId);
	}

	/**
	 * Returns all the registrations.
	 *
	 * @return the registrations
	 */
	public static List<Registration> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @return the range of registrations
	 */
	public static List<Registration> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of registrations
	 */
	public static List<Registration> findAll(
		int start, int end, OrderByComparator<Registration> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of registrations
	 */
	public static List<Registration> findAll(
		int start, int end, OrderByComparator<Registration> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the registrations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of registrations.
	 *
	 * @return the number of registrations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RegistrationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(RegistrationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile RegistrationPersistence _persistence;

}
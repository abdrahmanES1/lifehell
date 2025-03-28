/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.persistence;

import com.example.events.model.Event;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the event service. This utility wraps <code>com.example.events.service.persistence.impl.EventPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EventPersistence
 * @generated
 */
public class EventUtil {

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
	public static void clearCache(Event event) {
		getPersistence().clearCache(event);
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
	public static Map<Serializable, Event> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Event> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Event> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Event> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Event> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Event update(Event event) {
		return getPersistence().update(event);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Event update(Event event, ServiceContext serviceContext) {
		return getPersistence().update(event, serviceContext);
	}

	/**
	 * Returns all the events where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @return the matching events
	 */
	public static List<Event> findByByDate(Date eventDate) {
		return getPersistence().findByByDate(eventDate);
	}

	/**
	 * Returns a range of all the events where eventDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param eventDate the event date
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @return the range of matching events
	 */
	public static List<Event> findByByDate(Date eventDate, int start, int end) {
		return getPersistence().findByByDate(eventDate, start, end);
	}

	/**
	 * Returns an ordered range of all the events where eventDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param eventDate the event date
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching events
	 */
	public static List<Event> findByByDate(
		Date eventDate, int start, int end,
		OrderByComparator<Event> orderByComparator) {

		return getPersistence().findByByDate(
			eventDate, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the events where eventDate = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param eventDate the event date
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching events
	 */
	public static List<Event> findByByDate(
		Date eventDate, int start, int end,
		OrderByComparator<Event> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByByDate(
			eventDate, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public static Event findByByDate_First(
			Date eventDate, OrderByComparator<Event> orderByComparator)
		throws com.example.events.exception.NoSuchEventException {

		return getPersistence().findByByDate_First(
			eventDate, orderByComparator);
	}

	/**
	 * Returns the first event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching event, or <code>null</code> if a matching event could not be found
	 */
	public static Event fetchByByDate_First(
		Date eventDate, OrderByComparator<Event> orderByComparator) {

		return getPersistence().fetchByByDate_First(
			eventDate, orderByComparator);
	}

	/**
	 * Returns the last event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public static Event findByByDate_Last(
			Date eventDate, OrderByComparator<Event> orderByComparator)
		throws com.example.events.exception.NoSuchEventException {

		return getPersistence().findByByDate_Last(eventDate, orderByComparator);
	}

	/**
	 * Returns the last event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching event, or <code>null</code> if a matching event could not be found
	 */
	public static Event fetchByByDate_Last(
		Date eventDate, OrderByComparator<Event> orderByComparator) {

		return getPersistence().fetchByByDate_Last(
			eventDate, orderByComparator);
	}

	/**
	 * Returns the events before and after the current event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventId the primary key of the current event
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next event
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public static Event[] findByByDate_PrevAndNext(
			long eventId, Date eventDate,
			OrderByComparator<Event> orderByComparator)
		throws com.example.events.exception.NoSuchEventException {

		return getPersistence().findByByDate_PrevAndNext(
			eventId, eventDate, orderByComparator);
	}

	/**
	 * Removes all the events where eventDate = &#63; from the database.
	 *
	 * @param eventDate the event date
	 */
	public static void removeByByDate(Date eventDate) {
		getPersistence().removeByByDate(eventDate);
	}

	/**
	 * Returns the number of events where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @return the number of matching events
	 */
	public static int countByByDate(Date eventDate) {
		return getPersistence().countByByDate(eventDate);
	}

	/**
	 * Caches the event in the entity cache if it is enabled.
	 *
	 * @param event the event
	 */
	public static void cacheResult(Event event) {
		getPersistence().cacheResult(event);
	}

	/**
	 * Caches the events in the entity cache if it is enabled.
	 *
	 * @param events the events
	 */
	public static void cacheResult(List<Event> events) {
		getPersistence().cacheResult(events);
	}

	/**
	 * Creates a new event with the primary key. Does not add the event to the database.
	 *
	 * @param eventId the primary key for the new event
	 * @return the new event
	 */
	public static Event create(long eventId) {
		return getPersistence().create(eventId);
	}

	/**
	 * Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventId the primary key of the event
	 * @return the event that was removed
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public static Event remove(long eventId)
		throws com.example.events.exception.NoSuchEventException {

		return getPersistence().remove(eventId);
	}

	public static Event updateImpl(Event event) {
		return getPersistence().updateImpl(event);
	}

	/**
	 * Returns the event with the primary key or throws a <code>NoSuchEventException</code> if it could not be found.
	 *
	 * @param eventId the primary key of the event
	 * @return the event
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public static Event findByPrimaryKey(long eventId)
		throws com.example.events.exception.NoSuchEventException {

		return getPersistence().findByPrimaryKey(eventId);
	}

	/**
	 * Returns the event with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eventId the primary key of the event
	 * @return the event, or <code>null</code> if a event with the primary key could not be found
	 */
	public static Event fetchByPrimaryKey(long eventId) {
		return getPersistence().fetchByPrimaryKey(eventId);
	}

	/**
	 * Returns all the events.
	 *
	 * @return the events
	 */
	public static List<Event> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @return the range of events
	 */
	public static List<Event> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of events
	 */
	public static List<Event> findAll(
		int start, int end, OrderByComparator<Event> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of events
	 */
	public static List<Event> findAll(
		int start, int end, OrderByComparator<Event> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the events from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of events.
	 *
	 * @return the number of events
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EventPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(EventPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile EventPersistence _persistence;

}
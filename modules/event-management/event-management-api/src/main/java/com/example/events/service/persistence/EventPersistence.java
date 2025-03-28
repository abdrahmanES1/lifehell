/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.persistence;

import com.example.events.exception.NoSuchEventException;
import com.example.events.model.Event;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the event service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EventUtil
 * @generated
 */
@ProviderType
public interface EventPersistence extends BasePersistence<Event> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EventUtil} to access the event persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the events where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @return the matching events
	 */
	public java.util.List<Event> findByByDate(Date eventDate);

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
	public java.util.List<Event> findByByDate(
		Date eventDate, int start, int end);

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
	public java.util.List<Event> findByByDate(
		Date eventDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

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
	public java.util.List<Event> findByByDate(
		Date eventDate, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public Event findByByDate_First(
			Date eventDate,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Returns the first event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching event, or <code>null</code> if a matching event could not be found
	 */
	public Event fetchByByDate_First(
		Date eventDate,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns the last event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching event
	 * @throws NoSuchEventException if a matching event could not be found
	 */
	public Event findByByDate_Last(
			Date eventDate,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Returns the last event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching event, or <code>null</code> if a matching event could not be found
	 */
	public Event fetchByByDate_Last(
		Date eventDate,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

	/**
	 * Returns the events before and after the current event in the ordered set where eventDate = &#63;.
	 *
	 * @param eventId the primary key of the current event
	 * @param eventDate the event date
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next event
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public Event[] findByByDate_PrevAndNext(
			long eventId, Date eventDate,
			com.liferay.portal.kernel.util.OrderByComparator<Event>
				orderByComparator)
		throws NoSuchEventException;

	/**
	 * Removes all the events where eventDate = &#63; from the database.
	 *
	 * @param eventDate the event date
	 */
	public void removeByByDate(Date eventDate);

	/**
	 * Returns the number of events where eventDate = &#63;.
	 *
	 * @param eventDate the event date
	 * @return the number of matching events
	 */
	public int countByByDate(Date eventDate);

	/**
	 * Caches the event in the entity cache if it is enabled.
	 *
	 * @param event the event
	 */
	public void cacheResult(Event event);

	/**
	 * Caches the events in the entity cache if it is enabled.
	 *
	 * @param events the events
	 */
	public void cacheResult(java.util.List<Event> events);

	/**
	 * Creates a new event with the primary key. Does not add the event to the database.
	 *
	 * @param eventId the primary key for the new event
	 * @return the new event
	 */
	public Event create(long eventId);

	/**
	 * Removes the event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eventId the primary key of the event
	 * @return the event that was removed
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public Event remove(long eventId) throws NoSuchEventException;

	public Event updateImpl(Event event);

	/**
	 * Returns the event with the primary key or throws a <code>NoSuchEventException</code> if it could not be found.
	 *
	 * @param eventId the primary key of the event
	 * @return the event
	 * @throws NoSuchEventException if a event with the primary key could not be found
	 */
	public Event findByPrimaryKey(long eventId) throws NoSuchEventException;

	/**
	 * Returns the event with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eventId the primary key of the event
	 * @return the event, or <code>null</code> if a event with the primary key could not be found
	 */
	public Event fetchByPrimaryKey(long eventId);

	/**
	 * Returns all the events.
	 *
	 * @return the events
	 */
	public java.util.List<Event> findAll();

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
	public java.util.List<Event> findAll(int start, int end);

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
	public java.util.List<Event> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator);

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
	public java.util.List<Event> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Event>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the events from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of events.
	 *
	 * @return the number of events
	 */
	public int countAll();

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.persistence;

import com.example.events.exception.NoSuchRegistrationException;
import com.example.events.model.Registration;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationUtil
 * @generated
 */
@ProviderType
public interface RegistrationPersistence extends BasePersistence<Registration> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistrationUtil} to access the registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the registrations where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @return the matching registrations
	 */
	public java.util.List<Registration> findByEventId(long eventId);

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
	public java.util.List<Registration> findByEventId(
		long eventId, int start, int end);

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
	public java.util.List<Registration> findByEventId(
		long eventId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator);

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
	public java.util.List<Registration> findByEventId(
		long eventId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first registration in the ordered set where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public Registration findByEventId_First(
			long eventId,
			com.liferay.portal.kernel.util.OrderByComparator<Registration>
				orderByComparator)
		throws NoSuchRegistrationException;

	/**
	 * Returns the first registration in the ordered set where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public Registration fetchByEventId_First(
		long eventId,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator);

	/**
	 * Returns the last registration in the ordered set where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public Registration findByEventId_Last(
			long eventId,
			com.liferay.portal.kernel.util.OrderByComparator<Registration>
				orderByComparator)
		throws NoSuchRegistrationException;

	/**
	 * Returns the last registration in the ordered set where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public Registration fetchByEventId_Last(
		long eventId,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator);

	/**
	 * Returns the registrations before and after the current registration in the ordered set where eventId = &#63;.
	 *
	 * @param registrationId the primary key of the current registration
	 * @param eventId the event ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration
	 * @throws NoSuchRegistrationException if a registration with the primary key could not be found
	 */
	public Registration[] findByEventId_PrevAndNext(
			long registrationId, long eventId,
			com.liferay.portal.kernel.util.OrderByComparator<Registration>
				orderByComparator)
		throws NoSuchRegistrationException;

	/**
	 * Removes all the registrations where eventId = &#63; from the database.
	 *
	 * @param eventId the event ID
	 */
	public void removeByEventId(long eventId);

	/**
	 * Returns the number of registrations where eventId = &#63;.
	 *
	 * @param eventId the event ID
	 * @return the number of matching registrations
	 */
	public int countByEventId(long eventId);

	/**
	 * Returns all the registrations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching registrations
	 */
	public java.util.List<Registration> findByUserId(long userId);

	/**
	 * Returns a range of all the registrations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @return the range of matching registrations
	 */
	public java.util.List<Registration> findByUserId(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the registrations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registrations
	 */
	public java.util.List<Registration> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the registrations where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of registrations
	 * @param end the upper bound of the range of registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching registrations
	 */
	public java.util.List<Registration> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first registration in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public Registration findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Registration>
				orderByComparator)
		throws NoSuchRegistrationException;

	/**
	 * Returns the first registration in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public Registration fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator);

	/**
	 * Returns the last registration in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public Registration findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Registration>
				orderByComparator)
		throws NoSuchRegistrationException;

	/**
	 * Returns the last registration in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public Registration fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator);

	/**
	 * Returns the registrations before and after the current registration in the ordered set where userId = &#63;.
	 *
	 * @param registrationId the primary key of the current registration
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next registration
	 * @throws NoSuchRegistrationException if a registration with the primary key could not be found
	 */
	public Registration[] findByUserId_PrevAndNext(
			long registrationId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Registration>
				orderByComparator)
		throws NoSuchRegistrationException;

	/**
	 * Removes all the registrations where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of registrations where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching registrations
	 */
	public int countByUserId(long userId);

	/**
	 * Returns the registration where eventId = &#63; and userId = &#63; or throws a <code>NoSuchRegistrationException</code> if it could not be found.
	 *
	 * @param eventId the event ID
	 * @param userId the user ID
	 * @return the matching registration
	 * @throws NoSuchRegistrationException if a matching registration could not be found
	 */
	public Registration findByEventId_UserId(long eventId, long userId)
		throws NoSuchRegistrationException;

	/**
	 * Returns the registration where eventId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param eventId the event ID
	 * @param userId the user ID
	 * @return the matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public Registration fetchByEventId_UserId(long eventId, long userId);

	/**
	 * Returns the registration where eventId = &#63; and userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param eventId the event ID
	 * @param userId the user ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching registration, or <code>null</code> if a matching registration could not be found
	 */
	public Registration fetchByEventId_UserId(
		long eventId, long userId, boolean useFinderCache);

	/**
	 * Removes the registration where eventId = &#63; and userId = &#63; from the database.
	 *
	 * @param eventId the event ID
	 * @param userId the user ID
	 * @return the registration that was removed
	 */
	public Registration removeByEventId_UserId(long eventId, long userId)
		throws NoSuchRegistrationException;

	/**
	 * Returns the number of registrations where eventId = &#63; and userId = &#63;.
	 *
	 * @param eventId the event ID
	 * @param userId the user ID
	 * @return the number of matching registrations
	 */
	public int countByEventId_UserId(long eventId, long userId);

	/**
	 * Caches the registration in the entity cache if it is enabled.
	 *
	 * @param registration the registration
	 */
	public void cacheResult(Registration registration);

	/**
	 * Caches the registrations in the entity cache if it is enabled.
	 *
	 * @param registrations the registrations
	 */
	public void cacheResult(java.util.List<Registration> registrations);

	/**
	 * Creates a new registration with the primary key. Does not add the registration to the database.
	 *
	 * @param registrationId the primary key for the new registration
	 * @return the new registration
	 */
	public Registration create(long registrationId);

	/**
	 * Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registrationId the primary key of the registration
	 * @return the registration that was removed
	 * @throws NoSuchRegistrationException if a registration with the primary key could not be found
	 */
	public Registration remove(long registrationId)
		throws NoSuchRegistrationException;

	public Registration updateImpl(Registration registration);

	/**
	 * Returns the registration with the primary key or throws a <code>NoSuchRegistrationException</code> if it could not be found.
	 *
	 * @param registrationId the primary key of the registration
	 * @return the registration
	 * @throws NoSuchRegistrationException if a registration with the primary key could not be found
	 */
	public Registration findByPrimaryKey(long registrationId)
		throws NoSuchRegistrationException;

	/**
	 * Returns the registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param registrationId the primary key of the registration
	 * @return the registration, or <code>null</code> if a registration with the primary key could not be found
	 */
	public Registration fetchByPrimaryKey(long registrationId);

	/**
	 * Returns all the registrations.
	 *
	 * @return the registrations
	 */
	public java.util.List<Registration> findAll();

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
	public java.util.List<Registration> findAll(int start, int end);

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
	public java.util.List<Registration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator);

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
	public java.util.List<Registration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Registration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the registrations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of registrations.
	 *
	 * @return the number of registrations
	 */
	public int countAll();

}
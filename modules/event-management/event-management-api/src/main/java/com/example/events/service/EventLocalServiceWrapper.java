/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link EventLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EventLocalService
 * @generated
 */
public class EventLocalServiceWrapper
	implements EventLocalService, ServiceWrapper<EventLocalService> {

	public EventLocalServiceWrapper() {
		this(null);
	}

	public EventLocalServiceWrapper(EventLocalService eventLocalService) {
		_eventLocalService = eventLocalService;
	}

	/**
	 * Adds the event to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param event the event
	 * @return the event that was added
	 */
	@Override
	public com.example.events.model.Event addEvent(
		com.example.events.model.Event event) {

		return _eventLocalService.addEvent(event);
	}

	@Override
	public com.example.events.model.Event addEvent(
		String title, String description, java.util.Date eventDate,
		String location, int capacity) {

		return _eventLocalService.addEvent(
			title, description, eventDate, location, capacity);
	}

	/**
	 * Creates a new event with the primary key. Does not add the event to the database.
	 *
	 * @param eventId the primary key for the new event
	 * @return the new event
	 */
	@Override
	public com.example.events.model.Event createEvent(long eventId) {
		return _eventLocalService.createEvent(eventId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the event from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param event the event
	 * @return the event that was removed
	 */
	@Override
	public com.example.events.model.Event deleteEvent(
		com.example.events.model.Event event) {

		return _eventLocalService.deleteEvent(event);
	}

	/**
	 * Deletes the event with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param eventId the primary key of the event
	 * @return the event that was removed
	 * @throws PortalException if a event with the primary key could not be found
	 */
	@Override
	public com.example.events.model.Event deleteEvent(long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventLocalService.deleteEvent(eventId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _eventLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _eventLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _eventLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _eventLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.example.events.model.impl.EventModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _eventLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.example.events.model.impl.EventModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _eventLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _eventLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _eventLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.example.events.model.Event fetchEvent(long eventId) {
		return _eventLocalService.fetchEvent(eventId);
	}

	@Override
	public java.util.List<com.example.events.model.Event> findByDate(
		java.util.Date eventDate, int start, int end) {

		return _eventLocalService.findByDate(eventDate, start, end);
	}

	@Override
	public int findByDateCount(java.util.Date eventDate) {
		return _eventLocalService.findByDateCount(eventDate);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _eventLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the event with the primary key.
	 *
	 * @param eventId the primary key of the event
	 * @return the event
	 * @throws PortalException if a event with the primary key could not be found
	 */
	@Override
	public com.example.events.model.Event getEvent(long eventId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventLocalService.getEvent(eventId);
	}

	/**
	 * Returns a range of all the events.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.example.events.model.impl.EventModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of events
	 * @param end the upper bound of the range of events (not inclusive)
	 * @return the range of events
	 */
	@Override
	public java.util.List<com.example.events.model.Event> getEvents(
		int start, int end) {

		return _eventLocalService.getEvents(start, end);
	}

	/**
	 * Returns the number of events.
	 *
	 * @return the number of events
	 */
	@Override
	public int getEventsCount() {
		return _eventLocalService.getEventsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _eventLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _eventLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the event in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect EventLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param event the event
	 * @return the event that was updated
	 */
	@Override
	public com.example.events.model.Event updateEvent(
		com.example.events.model.Event event) {

		return _eventLocalService.updateEvent(event);
	}

	@Override
	public com.example.events.model.Event updateEvent(
			long eventId, String title, String description,
			java.util.Date eventDate, String location, int capacity,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _eventLocalService.updateEvent(
			eventId, title, description, eventDate, location, capacity,
			serviceContext);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _eventLocalService.getBasePersistence();
	}

	@Override
	public EventLocalService getWrappedService() {
		return _eventLocalService;
	}

	@Override
	public void setWrappedService(EventLocalService eventLocalService) {
		_eventLocalService = eventLocalService;
	}

	private EventLocalService _eventLocalService;

}
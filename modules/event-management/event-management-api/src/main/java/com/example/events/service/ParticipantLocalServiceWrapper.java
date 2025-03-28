/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ParticipantLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ParticipantLocalService
 * @generated
 */
public class ParticipantLocalServiceWrapper
	implements ParticipantLocalService,
			   ServiceWrapper<ParticipantLocalService> {

	public ParticipantLocalServiceWrapper() {
		this(null);
	}

	public ParticipantLocalServiceWrapper(
		ParticipantLocalService participantLocalService) {

		_participantLocalService = participantLocalService;
	}

	/**
	 * Adds the participant to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was added
	 */
	@Override
	public com.example.events.model.Participant addParticipant(
		com.example.events.model.Participant participant) {

		return _participantLocalService.addParticipant(participant);
	}

	/**
	 * Creates a new participant with the primary key. Does not add the participant to the database.
	 *
	 * @param participantId the primary key for the new participant
	 * @return the new participant
	 */
	@Override
	public com.example.events.model.Participant createParticipant(
		long participantId) {

		return _participantLocalService.createParticipant(participantId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the participant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participantId the primary key of the participant
	 * @return the participant that was removed
	 * @throws PortalException if a participant with the primary key could not be found
	 */
	@Override
	public com.example.events.model.Participant deleteParticipant(
			long participantId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.deleteParticipant(participantId);
	}

	/**
	 * Deletes the participant from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was removed
	 */
	@Override
	public com.example.events.model.Participant deleteParticipant(
		com.example.events.model.Participant participant) {

		return _participantLocalService.deleteParticipant(participant);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _participantLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _participantLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _participantLocalService.dynamicQuery();
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

		return _participantLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.example.events.model.impl.ParticipantModelImpl</code>.
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

		return _participantLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.example.events.model.impl.ParticipantModelImpl</code>.
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

		return _participantLocalService.dynamicQuery(
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

		return _participantLocalService.dynamicQueryCount(dynamicQuery);
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

		return _participantLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.example.events.model.Participant fetchParticipant(
		long participantId) {

		return _participantLocalService.fetchParticipant(participantId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _participantLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _participantLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _participantLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * Returns the participant with the primary key.
	 *
	 * @param participantId the primary key of the participant
	 * @return the participant
	 * @throws PortalException if a participant with the primary key could not be found
	 */
	@Override
	public com.example.events.model.Participant getParticipant(
			long participantId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.getParticipant(participantId);
	}

	/**
	 * Returns a range of all the participants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.example.events.model.impl.ParticipantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of participants
	 * @param end the upper bound of the range of participants (not inclusive)
	 * @return the range of participants
	 */
	@Override
	public java.util.List<com.example.events.model.Participant> getParticipants(
		int start, int end) {

		return _participantLocalService.getParticipants(start, end);
	}

	/**
	 * Returns the number of participants.
	 *
	 * @return the number of participants
	 */
	@Override
	public int getParticipantsCount() {
		return _participantLocalService.getParticipantsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _participantLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the participant in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ParticipantLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param participant the participant
	 * @return the participant that was updated
	 */
	@Override
	public com.example.events.model.Participant updateParticipant(
		com.example.events.model.Participant participant) {

		return _participantLocalService.updateParticipant(participant);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _participantLocalService.getBasePersistence();
	}

	@Override
	public ParticipantLocalService getWrappedService() {
		return _participantLocalService;
	}

	@Override
	public void setWrappedService(
		ParticipantLocalService participantLocalService) {

		_participantLocalService = participantLocalService;
	}

	private ParticipantLocalService _participantLocalService;

}
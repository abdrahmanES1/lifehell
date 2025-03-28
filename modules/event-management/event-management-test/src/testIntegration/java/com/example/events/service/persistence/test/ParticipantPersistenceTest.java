/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.persistence.test;

import com.example.events.exception.NoSuchParticipantException;
import com.example.events.model.Participant;
import com.example.events.service.ParticipantLocalServiceUtil;
import com.example.events.service.persistence.ParticipantPersistence;
import com.example.events.service.persistence.ParticipantUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class ParticipantPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.example.events.service"));

	@Before
	public void setUp() {
		_persistence = ParticipantUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Participant> iterator = _participants.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Participant participant = _persistence.create(pk);

		Assert.assertNotNull(participant);

		Assert.assertEquals(participant.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Participant newParticipant = addParticipant();

		_persistence.remove(newParticipant);

		Participant existingParticipant = _persistence.fetchByPrimaryKey(
			newParticipant.getPrimaryKey());

		Assert.assertNull(existingParticipant);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addParticipant();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Participant newParticipant = _persistence.create(pk);

		newParticipant.setEventId(RandomTestUtil.nextLong());

		newParticipant.setName(RandomTestUtil.randomString());

		newParticipant.setEmail(RandomTestUtil.randomString());

		_participants.add(_persistence.update(newParticipant));

		Participant existingParticipant = _persistence.findByPrimaryKey(
			newParticipant.getPrimaryKey());

		Assert.assertEquals(
			existingParticipant.getParticipantId(),
			newParticipant.getParticipantId());
		Assert.assertEquals(
			existingParticipant.getEventId(), newParticipant.getEventId());
		Assert.assertEquals(
			existingParticipant.getName(), newParticipant.getName());
		Assert.assertEquals(
			existingParticipant.getEmail(), newParticipant.getEmail());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Participant newParticipant = addParticipant();

		Participant existingParticipant = _persistence.findByPrimaryKey(
			newParticipant.getPrimaryKey());

		Assert.assertEquals(existingParticipant, newParticipant);
	}

	@Test(expected = NoSuchParticipantException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Participant> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Event_Participant", "participantId", true, "eventId", true, "name",
			true, "email", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Participant newParticipant = addParticipant();

		Participant existingParticipant = _persistence.fetchByPrimaryKey(
			newParticipant.getPrimaryKey());

		Assert.assertEquals(existingParticipant, newParticipant);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Participant missingParticipant = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingParticipant);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Participant newParticipant1 = addParticipant();
		Participant newParticipant2 = addParticipant();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newParticipant1.getPrimaryKey());
		primaryKeys.add(newParticipant2.getPrimaryKey());

		Map<Serializable, Participant> participants =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, participants.size());
		Assert.assertEquals(
			newParticipant1, participants.get(newParticipant1.getPrimaryKey()));
		Assert.assertEquals(
			newParticipant2, participants.get(newParticipant2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Participant> participants =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(participants.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Participant newParticipant = addParticipant();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newParticipant.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Participant> participants =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, participants.size());
		Assert.assertEquals(
			newParticipant, participants.get(newParticipant.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Participant> participants =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(participants.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Participant newParticipant = addParticipant();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newParticipant.getPrimaryKey());

		Map<Serializable, Participant> participants =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, participants.size());
		Assert.assertEquals(
			newParticipant, participants.get(newParticipant.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			ParticipantLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Participant>() {

				@Override
				public void performAction(Participant participant) {
					Assert.assertNotNull(participant);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Participant newParticipant = addParticipant();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Participant.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"participantId", newParticipant.getParticipantId()));

		List<Participant> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		Participant existingParticipant = result.get(0);

		Assert.assertEquals(existingParticipant, newParticipant);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Participant.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"participantId", RandomTestUtil.nextLong()));

		List<Participant> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Participant newParticipant = addParticipant();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Participant.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("participantId"));

		Object newParticipantId = newParticipant.getParticipantId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"participantId", new Object[] {newParticipantId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingParticipantId = result.get(0);

		Assert.assertEquals(existingParticipantId, newParticipantId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Participant.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("participantId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"participantId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Participant addParticipant() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Participant participant = _persistence.create(pk);

		participant.setEventId(RandomTestUtil.nextLong());

		participant.setName(RandomTestUtil.randomString());

		participant.setEmail(RandomTestUtil.randomString());

		_participants.add(_persistence.update(participant));

		return participant;
	}

	private List<Participant> _participants = new ArrayList<Participant>();
	private ParticipantPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.persistence.test;

import com.example.events.exception.NoSuchEventException;
import com.example.events.model.Event;
import com.example.events.service.EventLocalServiceUtil;
import com.example.events.service.persistence.EventPersistence;
import com.example.events.service.persistence.EventUtil;

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
import com.liferay.portal.kernel.util.Time;
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
public class EventPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.example.events.service"));

	@Before
	public void setUp() {
		_persistence = EventUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Event> iterator = _events.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Event event = _persistence.create(pk);

		Assert.assertNotNull(event);

		Assert.assertEquals(event.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Event newEvent = addEvent();

		_persistence.remove(newEvent);

		Event existingEvent = _persistence.fetchByPrimaryKey(
			newEvent.getPrimaryKey());

		Assert.assertNull(existingEvent);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEvent();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Event newEvent = _persistence.create(pk);

		newEvent.setTitle(RandomTestUtil.randomString());

		newEvent.setDescription(RandomTestUtil.randomString());

		newEvent.setEventDate(RandomTestUtil.nextDate());

		newEvent.setLocation(RandomTestUtil.randomString());

		newEvent.setCapacity(RandomTestUtil.nextInt());

		newEvent.setAvailableSeats(RandomTestUtil.nextInt());

		_events.add(_persistence.update(newEvent));

		Event existingEvent = _persistence.findByPrimaryKey(
			newEvent.getPrimaryKey());

		Assert.assertEquals(existingEvent.getEventId(), newEvent.getEventId());
		Assert.assertEquals(existingEvent.getTitle(), newEvent.getTitle());
		Assert.assertEquals(
			existingEvent.getDescription(), newEvent.getDescription());
		Assert.assertEquals(
			Time.getShortTimestamp(existingEvent.getEventDate()),
			Time.getShortTimestamp(newEvent.getEventDate()));
		Assert.assertEquals(
			existingEvent.getLocation(), newEvent.getLocation());
		Assert.assertEquals(
			existingEvent.getCapacity(), newEvent.getCapacity());
		Assert.assertEquals(
			existingEvent.getAvailableSeats(), newEvent.getAvailableSeats());
	}

	@Test
	public void testCountByByDate() throws Exception {
		_persistence.countByByDate(RandomTestUtil.nextDate());

		_persistence.countByByDate(RandomTestUtil.nextDate());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Event newEvent = addEvent();

		Event existingEvent = _persistence.findByPrimaryKey(
			newEvent.getPrimaryKey());

		Assert.assertEquals(existingEvent, newEvent);
	}

	@Test(expected = NoSuchEventException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Event> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Event_Event", "eventId", true, "title", true, "description", true,
			"eventDate", true, "location", true, "capacity", true,
			"availableSeats", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Event newEvent = addEvent();

		Event existingEvent = _persistence.fetchByPrimaryKey(
			newEvent.getPrimaryKey());

		Assert.assertEquals(existingEvent, newEvent);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Event missingEvent = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEvent);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Event newEvent1 = addEvent();
		Event newEvent2 = addEvent();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEvent1.getPrimaryKey());
		primaryKeys.add(newEvent2.getPrimaryKey());

		Map<Serializable, Event> events = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, events.size());
		Assert.assertEquals(newEvent1, events.get(newEvent1.getPrimaryKey()));
		Assert.assertEquals(newEvent2, events.get(newEvent2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Event> events = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(events.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Event newEvent = addEvent();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEvent.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Event> events = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, events.size());
		Assert.assertEquals(newEvent, events.get(newEvent.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Event> events = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(events.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Event newEvent = addEvent();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEvent.getPrimaryKey());

		Map<Serializable, Event> events = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, events.size());
		Assert.assertEquals(newEvent, events.get(newEvent.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			EventLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Event>() {

				@Override
				public void performAction(Event event) {
					Assert.assertNotNull(event);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Event newEvent = addEvent();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Event.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("eventId", newEvent.getEventId()));

		List<Event> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Event existingEvent = result.get(0);

		Assert.assertEquals(existingEvent, newEvent);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Event.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("eventId", RandomTestUtil.nextLong()));

		List<Event> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Event newEvent = addEvent();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Event.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("eventId"));

		Object newEventId = newEvent.getEventId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("eventId", new Object[] {newEventId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingEventId = result.get(0);

		Assert.assertEquals(existingEventId, newEventId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Event.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("eventId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"eventId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Event addEvent() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Event event = _persistence.create(pk);

		event.setTitle(RandomTestUtil.randomString());

		event.setDescription(RandomTestUtil.randomString());

		event.setEventDate(RandomTestUtil.nextDate());

		event.setLocation(RandomTestUtil.randomString());

		event.setCapacity(RandomTestUtil.nextInt());

		event.setAvailableSeats(RandomTestUtil.nextInt());

		_events.add(_persistence.update(event));

		return event;
	}

	private List<Event> _events = new ArrayList<Event>();
	private EventPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}
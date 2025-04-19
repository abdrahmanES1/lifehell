/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.events.service.impl;

import com.example.events.service.base.RegistrationLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import org.osgi.service.component.annotations.Component;

import com.example.events.exception.NoSuchRegistrationException;
import com.example.events.model.Registration;


/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.example.events.model.Registration",
	service = AopService.class
)
public class RegistrationLocalServiceImpl
	extends RegistrationLocalServiceBaseImpl {
	
	
	// Add a new registration
    public Registration addRegistration(long eventId, long userId) {
        long registrationId = counterLocalService.increment(Registration.class.getName());
        Registration registration = registrationPersistence.create(registrationId);

        // TODO  : reduce the available seats 
        registration.setEventId(eventId);
        registration.setUserId(userId);
        registration.setCreateDate(new java.util.Date());

        return registrationPersistence.update(registration);
    }

    // Fetch a registration by event ID and user ID
    public Registration fetchRegistration(long eventId, long userId){
    	try {
    		
    		return  registrationPersistence.findByEventId_UserId(eventId, userId);
    		
    	}catch(NoSuchRegistrationException e) {
    		
    		return null;
    	}
    }

    // Count registrations for an event
    public int getRegistrationsCount(long eventId) {
        return registrationPersistence.countByEventId(eventId);
    }
}
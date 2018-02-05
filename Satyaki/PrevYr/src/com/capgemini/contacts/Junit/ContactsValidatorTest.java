package com.capgemini.contacts.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.contacts.service.ContactsValidator;

public class ContactsValidatorTest {
	ContactsValidator cv = new ContactsValidator();
	@Test
	public void testValidateCName() {
		assertEquals(true,cv.validateCName("devirudhrrthy"));
	}

	@Test
	public void testValidateMobileNo() {
		assertEquals(false,cv.validateMobileNo("10987"));
	}

	@Test
	public void testValidateEmailID() {
		assertEquals(false,cv.validateEmailID("deviru"));
	}

	@Test
	public void testValidateGroupName() {
		assertEquals(false,cv.validateGroupName("ghdiefi"));
	}

}

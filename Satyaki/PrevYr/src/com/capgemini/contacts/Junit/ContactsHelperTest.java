package com.capgemini.contacts.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.service.ContactsHelper;

	public class ContactsHelperTest {

		ContactsHelper helper = new ContactsHelper();
		@Test(timeout=15)
		public void testAddContactDetails() {
			helper.addContactDetails(new ContactDetails(3,"Devi Rudh","9566294385","9941319500","devirudh@gmail.com","FRIENDS"));
		}

		@Test(timeout=15)
		public void testDeleteContactDetails() {
			helper.deleteContactDetails(1);
	}
	}

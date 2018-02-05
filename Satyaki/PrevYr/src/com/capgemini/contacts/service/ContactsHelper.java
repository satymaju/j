package com.capgemini.contacts.service;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.dao.ContactClientdao;
import com.capgemini.contacts.exception.ContactIdNotExist;
import com.capgemini.contacts.exception.DuplicateContactException;

public class ContactsHelper {
	static ContactClientdao dao = new ContactClientdao();
	public void addContactDetails(ContactDetails contactDetails){
		try {
			dao.addToContacts(contactDetails);
		} catch (DuplicateContactException e) {

		}
	}
	public void deleteContactDetails(int contactID){
		try {
			dao.removeFromContacts(contactID);
		} catch (ContactIdNotExist e) {

			
		}
	}
	
	static{
		try {
			dao.addToContacts(new ContactDetails(1,"Kirti Roy","9234534500",null,"kirtiroy@yahoo.co.in","FAMILY"));
		} catch (DuplicateContactException e) {
			e.printStackTrace();
		}
		try {
			dao.addToContacts(new ContactDetails(2,"Raj Singh","8288866678","8234343434","Arun16@gmail.com","FRIENDS"));
		} catch (DuplicateContactException e) {
			e.printStackTrace();
		}
	}
}

	





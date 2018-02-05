package com.capgemini.contacts.dao;

import java.util.ArrayList;
import java.util.Iterator;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.exception.ContactIdNotExist;
import com.capgemini.contacts.exception.DuplicateContactException;

public class ContactClientdao {
	static ArrayList list = new ArrayList();
	public void addToContacts (ContactDetails details)throws DuplicateContactException{
		boolean flag= false;
		Iterator it = list.iterator();
		while(it.hasNext()){
			ContactDetails det=(ContactDetails) it.next();
			if(det.getcName().equals(details.getcName())){
				flag=true;
				throw new DuplicateContactException();
			}
		}
		if(flag==false){
			
			try {
				list.add(details);
			} catch (Exception e) {
				System.out.println("Failed to add the contact");
			}
			System.out.println("Contact Added");
			System.out.println("Contact ID is: " + details.getContactID() );
		}
	
	}
	
	
	
	public void removeFromContacts(int contactID) throws ContactIdNotExist{
		Iterator it = list.iterator();
		boolean flag=false;
		int i=0;
		while(it.hasNext()){
			ContactDetails cd=(ContactDetails) it.next();
			if(cd.getContactID()==contactID){
				list.remove(cd);
				flag=true;
				System.out.println("Contact deleted successfully");
				break;
			}
			i++;
		}
		if(!flag){
			throw new ContactIdNotExist();
		}
		
	}
}




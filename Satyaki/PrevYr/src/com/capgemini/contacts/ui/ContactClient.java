package com.capgemini.contacts.ui;

import java.util.Scanner;
import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.service.ContactsHelper;
import com.capgemini.contacts.service.ContactsValidator;

public class ContactClient {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		ContactClient client = new ContactClient();
		client.displayMenu();
	}
	public void displayMenu(){
		int option;
		boolean val=false;
		ContactsValidator service = new ContactsValidator(); 
		ContactDetails details = new ContactDetails();
		ContactsHelper helper = new ContactsHelper();
	
	
		while(true){
		System.out.println("Please enter your option :");
		System.out.println("1. Add New Contact");
		System.out.println("2. Delete Contact");
		System.out.println("3. Exit");
		
		try {
			option=Integer.parseInt(scanner.nextLine());
		
		
		switch(option){
		case 1:
			do{
				System.out.println("Enter Details:");
				details= AddNewContact();
				val=service.validateDetails(details);
				if(val==false){
					System.out.println("Please Enter the correct Details");
				}
			}
			while(val==false);
			helper.addContactDetails(details);
			
			break;
		case 2:
			System.out.println("Enter the contact ID: ");
			int contactID = Integer.parseInt(scanner.nextLine());
			helper.deleteContactDetails(contactID);
			break;
		case 3:
			System.exit(0);
			
		default: 
			System.out.println("You have entered wrong option");
		
		}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter valid option");
		}
		}
	}
	
	public String getContactID(int contactID) {
		ContactDetails details=new ContactDetails();
		int ID=details.getContactID();
		System.out.println("Contact ID: "+ID);
		return null;
	}
	public static ContactDetails AddNewContact(){
		ContactDetails details = new ContactDetails();
	
		System.out.print("Enter Name : ");
		details.setcName(scanner.nextLine());
		System.out.print("Enter Mobile No. : ");
		details.setMobileNo1(scanner.nextLine());
		System.out.print("Do you want to add alternate Mobile No. ? ");
		
		char ch;
		ch = scanner.nextLine().charAt(0);
		if(ch=='Y' || ch=='y')
		{
			System.out.print("Enter Mobile No. : ");
			details.setMobileNo2(scanner.nextLine());
		}
		else{
			details.setMobileNo2(null);
		}
		System.out.print("Enter Email Id : ");
		details.setEmailID(scanner.nextLine());
		
		System.out.print("Select the Group (Friends/Family/CoWorkers) : ");
		String group=scanner.nextLine().toUpperCase();
		details.setGroupName(group);
		
		return details;
	}
}

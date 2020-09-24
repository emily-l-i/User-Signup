package com.flexon.signup;
import java.util.ArrayList;

public class ContactsDAO {
	private ArrayList<Contact> contactList = new ArrayList<>();
	
	//add contact by everything required in contact method
	public void addContact(Contact contact) {
		contactList.add(contact);
	}
	
	//remove contact by phone number
	public void removeContact(String phoneNumber) {
		for (Contact contact : contactList) 
		{
			if (contact.getPhoneNumber()==phoneNumber)
			{
				contactList.remove(contact);
			}
		}	
	}
	
	//allow changes when user's phone number and email address are a match
	public void updateContact(Contact contact, String phoneNumber, String emailAddress) {
		for (Contact Contact : contactList)
		{
			if (Contact.getPhoneNumber()==phoneNumber && Contact.getEmailAddress() == emailAddress)
			{
				contactList.set(0, contact);
			}
		}
	
	}
	
	//print user's first name and then last name
	public void printContacts(){
		for (Contact contact : contactList) 
			System.out.println(contact.getFirstName()+", "+contact.getLastName());
	}
	
}

package org.Lektion_27_11_2023.ContactApplication;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddressBookTest {

    @Test
    public void testAddContact(){
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Jakob","Jakob@jakob.com","0701453563");
        addressBook.addContact(contact);
        List<Contact> contacts = addressBook.getAllContacts();
        assertTrue(contacts.contains(contact));
    }
    @Test
    public void testRemoveContact(){
        AddressBook addressBook = new AddressBook();

        Contact contact = new Contact("Jakob","Jakob@jakob.com","0701453563");
        Contact contact1 = new Contact("Kalle","Jakob@jakob.com","0701453563");
        addressBook.addContact(contact);
        addressBook.removeContact(contact);
        List<Contact> contacts = addressBook.getAllContacts();
        assertEquals(0,contacts.size());
        addressBook.addContact(contact);
        addressBook.addContact(contact1);
        addressBook.removeContact(contact1);
        contacts = addressBook.getAllContacts();
        assertEquals(1,contacts.size());
    }

    @Test
    public void testChangeContactNumber(){
        AddressBook addressBook = new AddressBook();
        Contact contact = new Contact("Jakob","Jakob@jakob.com","0701453563");
        addressBook.addContact(contact);
        addressBook.changeContactNumber(contact,"00000000");

        List<Contact> contacts = addressBook.getAllContacts();

        assertEquals("00000000",contacts.get(0).number);

    }



}

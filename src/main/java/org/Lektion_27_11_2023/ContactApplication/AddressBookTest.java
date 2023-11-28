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



}

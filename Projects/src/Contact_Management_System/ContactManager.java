package Contact_Management_System;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {

    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phone, String email) {

        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added - " + name);
    }

    public List<Contact> searchContact(String name) {

        List<Contact> matches = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name.trim())) {
                matches.add(contact);
            }
        }
        return matches;
    }

}

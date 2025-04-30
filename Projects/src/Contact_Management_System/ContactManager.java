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

    public void editContact(String oldName, String newName, String newPhone, String newEmail) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(oldName.trim())) {
                contact.setName(newName);
                contact.setPhoneNumber(newPhone);
                contact.setEmail(newEmail);
                System.out.println("contact updated: " + newName);
                return;
            }
        }
        System.out.println("contact not found " + oldName);
    }

    public void deleteContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name.trim())) {
                contacts.remove(contact);
                System.out.println("contact deleted -" + name);
                return;

            }
        }
        System.out.println("contact not found: " + name);
    }

    public void listAllContact() {
        if (contacts.isEmpty()) {
            System.out.println("no contacts found.");
            return;
        }
        System.out.println("\n ------ All Contacts------");
        for (Contact contact : contacts) {
            System.out.println(contact);    
        }
    }
}

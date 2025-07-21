package PhoneBook;

import Contact.*;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);

    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact findByPhoneNumber(String number) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(number)) {
                return contact;
            }
        }
        return null;
    }

    public boolean removeContact(String number) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(number)) {
                contacts.remove(contact);
                return true;
            }
        }
        return false;
    }

    public List<Contact> findByFirstName(String firstName) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                results.add(contact);
            }
        }
        return results;
    }


    public List<Contact> findByLastName(String lastName) {
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getLastName().equalsIgnoreCase(lastName)) {
                results.add(contact);
            }
        }
        return results;
    }
    public boolean editContact(String oldNumber, Contact newInfo) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getPhoneNumber().equals(oldNumber)) {
                contacts.set(i, newInfo);
                return true;
            }
        }
        return false;
    }

    public void listAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

}
package testPhoneBook;

import Contact.Contact;
import PhoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestPhoneBook {
    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Old", "Name", "08041994299"));
        phoneBook.addContact(new Contact("John", "Doe", "08161247817"));
        phoneBook.addContact(new Contact("Jane", "Doe", "08061328142"));
        phoneBook.addContact(new Contact("Jake", "Smith", "07046591103"));
    }
    @Test
    public void testAddContact() {
        Contact newContact = new Contact("Alice", "Wonder", "08161247818");
        phoneBook.addContact(newContact);
        assertEquals(newContact, phoneBook.findByPhoneNumber("08161247818"));
        }
    @Test
    public void testRemoveContact() {
        boolean removed = phoneBook.removeContact("08161247817");
        assertTrue(removed);
        assertNull(phoneBook.findByPhoneNumber("08161247817"));
    }
    @Test
    public void testFindByFirstName() {
        List<Contact> results = phoneBook.findByFirstName("Jane");
        assertEquals(1, results.size());
        assertEquals("08061328142", results.get(0).getPhoneNumber());
    }
    @Test
    public void testFindByLastName() {
        List<Contact> results = phoneBook.findByLastName("Doe");
        assertEquals(2, results.size());
    }
    @Test
    public void testEditContact() {
        Contact newInfo = new Contact("Johnny", "Bravo", "09109987612");
        boolean edited = phoneBook.editContact("08041994299", newInfo);
        assertTrue(edited);
        Contact updated = phoneBook.findByPhoneNumber("09109987612");
        assertNotNull(updated);
        assertEquals("Johnny", updated.getFirstName());
        assertEquals("Bravo", updated.getLastName());
        assertNull(phoneBook.findByPhoneNumber("08041994299"));
    }



}

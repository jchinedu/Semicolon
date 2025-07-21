package TestContact;
import Contact.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestContact {

    @Test
    public void testContactCreation() {
        Contact mycontact = new Contact("john", "Chinedu", "07046591103");
        assertEquals("john", mycontact.getFirstName());
        assertEquals("Chinedu", mycontact.getLastName());
        assertEquals("07046591103", mycontact.getPhoneNumber());
    }

    }


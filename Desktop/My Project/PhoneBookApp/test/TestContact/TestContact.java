package TestContact;
import Contact.Contact;
import org.junit.jupiter.api.Test;
import Contact.PhoneNumberMustBeEleven;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestContact {

    @Test
    public void testContactCreation() {
        Contact mycontact = new Contact("john", "Chinedu", "07046591103");
        assertEquals("john", mycontact.getFirstName());
        assertEquals("Chinedu", mycontact.getLastName());
        assertEquals("07046591103", mycontact.getPhoneNumber());
    }
    @Test
    public void testthatphoneNumberMustBeTenDigitLong(){
        Contact mycontact = new Contact("john", "Chinedu", "0704659110");
        assertThrows(PhoneNumberMustBeEleven.class, () -> mycontact.getPhoneNumber());
    }
    @Test
    public void testSetters() {
        Contact mycontact = new Contact("daniel", "chima", "08036030275");
        mycontact.setFirstName("Jane");
        mycontact.setLastName("Smith");
        mycontact.setPhoneNumber("08061328142");

        assertEquals("Jane", mycontact.getFirstName());
        assertEquals("Smith", mycontact.getLastName());
        assertEquals("08061328142", mycontact.getPhoneNumber());
    }


}


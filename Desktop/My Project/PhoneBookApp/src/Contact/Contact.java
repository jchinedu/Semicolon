package Contact;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        if (!phoneNumber.startsWith("0") || phoneNumber.length() != 11) {
            throw new PhoneNumberMustBeEleven();
        }

        return phoneNumber;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }
    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }
}

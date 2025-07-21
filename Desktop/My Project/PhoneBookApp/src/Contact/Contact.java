package Contact;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        setPhoneNumber(phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String number) {
        String[] validPrefixes = {"080", "070", "090", "081", "091"};

        boolean isValidPrefix = false;
        for (String prefix : validPrefixes) {
            if (number.startsWith(prefix)) {
                isValidPrefix = true;
                break;
            }
        }

        if (!isValidPrefix) {
            throw new PhoneNumberException();
        }

        if (number.length() != 11) {
            throw new PhoneNumberMustBeEleven();
        }

        this.phoneNumber = number;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + phoneNumber;
    }
}

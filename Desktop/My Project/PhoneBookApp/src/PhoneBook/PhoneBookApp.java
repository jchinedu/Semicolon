package PhoneBook;

import Contact.Contact;

import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("\n--- Phone Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Find by Phone Number");
            System.out.println("4. Find by First Name");
            System.out.println("5. Find by Last Name");
            System.out.println("6. Edit Contact");
            System.out.println("7. View All Contacts");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            String option = scanner.next();
            scanner.nextLine();

            switch (option) {
                case "1" -> {
                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Phone Number: ");
                    String phone = scanner.nextLine();
                    phoneBook.addContact(new Contact(firstName, lastName, phone));
                }
                case "2" -> {
                    System.out.print("Phone Number to remove: ");
                    String phone = scanner.nextLine();
                    if (phoneBook.removeContact(phone)) {
                        System.out.println("Contact removed.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                }
                case "3" -> {
                    System.out.print("Phone Number: ");
                    String phone = scanner.nextLine();
                    Contact found = phoneBook.findByPhoneNumber(phone);
                    System.out.println(found != null ? found : "Not found");
                }
                case "4" -> {
                    System.out.print("First Name: ");
                    String name = scanner.nextLine();
                    var results = phoneBook.findByFirstName(name);
                    results.forEach(System.out::println);
                }
                case "5" -> {
                    System.out.print("Last Name: ");
                    String name = scanner.nextLine();
                    var results = phoneBook.findByLastName(name);
                    results.forEach(System.out::println);
                }
                case "6" -> {
                    System.out.print("Phone Number to edit: ");
                    String phone = scanner.nextLine();
                    System.out.print("New First Name: ");
                    String newFirst = scanner.nextLine();
                    System.out.print("New Last Name: ");
                    String newLast = scanner.nextLine();
                    System.out.print("New Phone Number: ");
                    String newPhone = scanner.nextLine();
                    boolean success = phoneBook.editContact(phone, new Contact(newFirst, newLast, newPhone));
                    System.out.println(success ? "Contact updated." : "Contact not found.");
                }
                case "7" -> phoneBook.listAllContacts();
                case "0" -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}

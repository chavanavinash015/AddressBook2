package com.bridelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {

    static Map<String, AddressBookSystem> bookAddress = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addAddressBook() {
        System.out.println("Create a New Address Book\nEnter the New AddressBook name");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        if (book == null) {
            AddressBookSystem addressBook = new AddressBookSystem();
            bookAddress.put(bookName, addressBook);
            System.out.println(bookAddress.entrySet());
            System.out.println("SuccessFully added New AddressBook");
        } else {
            System.out.println("AddressBook with this name already exists ");
        }
    }

    public static void addContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.addContactDetails();
        }
    }

    public static void editContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.editContactDetails();
        }
    }

    public static void deleteContact() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.deleteContacts();
        }
    }

    public static void addMultipleContacts() {
        System.out.println("Enter the AddressBook Name");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No Book found with these name");
        } else {
            addressBook.addContactDetails();
        }
    }
    public static void showAddressBookDetails() {
        System.out.println("Enter Address Book System Name");
        String bookName = scanner.next();
        AddressBookSystem address = bookAddress.get(bookName);
        AddressBookMain addressBookSystem = new AddressBookMain();
        if (address == null) {
            System.out.println("No book found this name");
        } else {
            addressBookSystem.showAddressBookDetails();
        }
    }

    public static void searchByCityOrState() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.searchContactDetails();
        }
    }
    public static void differentOptions() {
        boolean condition = true;
        while (condition) {
            System.out.println("\n" + "1.SortByPersonName" + "\n" + "2.SortByCity" + "\n" + "3.SortByState" + "\n" + "4.SortByZip" + "\n" + "5.Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    sortByPersonName();
                    break;
                case 2:
                    sortByCity();
                    break;
                case 3:
                    sortByState();
                    break;
                case 4:
                    sortByZip();
                    break;
                case 5:
                    condition = false;
                    System.out.println("Back To Main menu");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
    public static void sortByPersonName() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortByPersonName();
        }
    }
    public static void sortByCity() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortingByCity();
        }
    }


    public static void sortByState() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortingByState();
        }
    }


    public static void sortByZip() {
        System.out.println("Enter the AddressBookName ");
        String bookName = scanner.next();
        AddressBookSystem book = bookAddress.get(bookName);
        AddressBookMain addressBook = new AddressBookMain();
        if (book == null) {
            System.out.println("No book found with these name");
        } else {
            addressBook.sortingByZip();
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook program");
        boolean condition = true;
        while (condition) {
            System.out.println("choose options \n1 : AddNewAddressBook\n2 : AddContact\n3 : EditContact\n4 : Delete Contact\n5 : Add multiple contacts\n6 : Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addAddressBook();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    editContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    addMultipleContacts();
                    break;
                case 6:
                    showAddressBookDetails();
                case 7:
                    searchByCityOrState();
                case 8:
                    differentOptions();
                    break;
                default:
                    condition = false;
                    System.out.println("Exiting the loop ");
            }
        }
    }
}

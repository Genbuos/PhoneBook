package com.zipcodewilmington.phonebook;

public class run {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Jordan", "501-333-2222");
        System.out.println(phoneBook);
    }
}

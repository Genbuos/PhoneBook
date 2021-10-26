package com.zipcodewilmington.phonebook;


import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {
//
    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new HashMap<>(map);
    }

    public PhoneBook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name,Collections.singletonList(phoneNumber) );
    }

    public void addAll(String name, String... phoneNumbers) {
       ArrayList<String> storedContacts = new ArrayList<String>(Arrays.asList(phoneNumbers));
        phonebook.put(name,storedContacts);
    }

    public void remove(String name) {
        phonebook.remove(name);

    }

    public Boolean hasEntry(String name) {

        return phonebook.containsKey(name);
    }

    public List<String> lookup(String name) {
if (phonebook.containsValue(name)){
    return phonebook.get(name);
        }
    return null;
    }
//got stuck on this one
    public String reverseLookup(String phoneNumber)  {
        if(phonebook.containsKey(phoneNumber)){

            return phoneNumber;
        }




        return null;
    }

    public List<String> getAllContactNames() {
        return null;
    }

    public Map<String, List<String>> getMap() {
        return null;
    }

    @Override
    public String toString() {
        return "PhoneBook " +
                "phonebook=" + phonebook +
                '}';
    }
}

package edu.ldsbc.assignment9.services.impl;

import edu.ldsbc.assignment9.models.Contact;
import java.util.ArrayList;
import java.util.List;

public class DataRepo {

    private List<Contact> contactList = new ArrayList<>();
    private List<Integer> queue = new ArrayList<>();

    private static DataRepo ourInstance = new DataRepo();

    public static DataRepo getInstance() {
        return ourInstance;
    }

    private DataRepo() {
        contactList.add(new Contact("lori","801-294-3553", "SLC"));
        contactList.add(new Contact("jim","765-123-5555", "Provo"));
        contactList.add(new Contact("scott", "956-343-1234", "Denver"));
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void addToContactList(Contact contact){
        contactList.add(contact);
    }

    public void addToQueue(String item){
        queue.add(Integer.parseInt(item));
    }

    public List<Integer> getQueue() {
        return queue;
    }
}
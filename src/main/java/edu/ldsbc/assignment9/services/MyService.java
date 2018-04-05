package edu.ldsbc.assignment9.services;

import edu.ldsbc.assignment9.models.Contact;
import edu.ldsbc.assignment9.models.QueueData;
import java.util.List;

public interface MyService {
    String getName();
    List<Contact> getContacts();

    void addContact(Contact contact);

    void parseAndAddToQueue(QueueData data);
    List<String> viewItmesInQueue();

}
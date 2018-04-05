package edu.ldsbc.assignment9.services.impl;

import edu.ldsbc.assignment9.models.Contact;
import edu.ldsbc.assignment9.models.QueueData;
import edu.ldsbc.assignment9.services.MyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String getName() {
        return "Dobby";
    }

    @Override
    public List<Contact> getContacts() {
        return DataRepo.getInstance().getContactList();
    }

    @Override
    public void addContact(Contact contact) {
        DataRepo.getInstance().addToContactList(contact);
    }

    @Override
    public void parseAndAddToQueue(QueueData data) {
        //parse data
        String[] newItems = data.getItemForQueue().split(",");
        //loop
        for (String item: newItems) {
            //add to queue
            DataRepo.getInstance().addToQueue(item);
        }
    }

    @Override
    public List<String> viewItmesInQueue() {
        //read items from queue
        DataRepo.getInstance().getQueue();
        return null;
    }
}
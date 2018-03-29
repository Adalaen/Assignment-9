package edu.ldsbc.assignment9.services.impl;

import edu.ldsbc.assignment9.models.Contact;
import edu.ldsbc.assignment9.services.MyService;
import org.springframework.stereotype.Service;
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

}
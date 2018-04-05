package edu.ldsbc.assignment9.controllers;

import edu.ldsbc.assignment9.models.Contact;
import edu.ldsbc.assignment9.models.QueueData;
import edu.ldsbc.assignment9.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    MyService service;

    //home page
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index()
    {
        return "index"; // index is the page name
    }

    //home page
    @RequestMapping(value = "/queue", method = RequestMethod.GET)
    public String indexQueue(Model model)
    {
        List<String> list = service.viewItmesInQueue();
        model.addAttribute("queueItmes", list);
        return "queue"; // queue is the page name
    }

    //add new contact
    @RequestMapping(value = "/addToQueue", method = RequestMethod.POST)
    public String addItemToQueue(QueueData data, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "queue";
        }
        service.parseAndAddToQueue(data);

        return "redirect:/queue"; //redirect to homepage
    }

    //
    //
    //

    //contact page
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String indexContact(Model model)
    {
        List<Contact>  contacts = service.getContacts();
        model.addAttribute("names", contacts); //data on page
        return "contacts"; // contacts is the page name
    }

    //add new contact
    @RequestMapping(value = "/contact/new", method = RequestMethod.POST)
    public String addContact(Contact contact, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "contacts";
        }
        service.addContact(contact);

        return "redirect:/contact"; //redirect to homepage
    }

    //remove contact(Not working)
    @RequestMapping(value = "/contact/remove/???", method = RequestMethod.GET)
    public String removeContact(String name, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "contacts";
        }
        //service.removeContact(name);

        return "redirect:/contact"; //redirect to homepage
    }
}
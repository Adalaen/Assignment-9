package edu.ldsbc.assignment9.controllers;

import edu.ldsbc.assignment9.models.Contact;
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
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String index(Model model)
    {
        List<Contact>  contacts = service.getContacts();
        model.addAttribute("names", contacts); //data on page
        return "index"; // index is the page name
    }

    //     add new contact
    @RequestMapping(value = "/contact/new", method = RequestMethod.POST)
    public String addNewPost(Contact contact, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        service.addContact(contact);

        return "redirect:/contact"; //redirect to homepage
    }

    @RequestMapping(value = "/contact/remove/???", method = RequestMethod.GET)
    public String removeContact(String name, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        //service.removeContact(name);

        return "redirect:/adalaen"; //redirect to homepage
    }
}
package com.cyorg.BootstrapDemo.controller;

import com.cyorg.BootstrapDemo.entity.Person;
import com.cyorg.BootstrapDemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yorga on 11-05-2017.
 */
@Controller
@RequestMapping(value = "/bootstrap/")
public class BootStrapController {
    @Autowired
    private PersonService personService;

//    @RequestMapping(method = RequestMethod.GET)
//    public String homepage() {
//        return "index";
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homepage(Model model) {
        model.addAttribute("persons", personService.findAllPersons());
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/")
    public String addPerson(@ModelAttribute Person person, BindingResult bindingResult, Model model) {
        System.out.println("Adding New Person --> " + person.toString());
        personService.addPerson(person);
        model.addAttribute("persons", personService.findAllPersons());
        return "index";
    }

}

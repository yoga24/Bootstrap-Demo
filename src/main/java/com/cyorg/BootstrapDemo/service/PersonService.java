package com.cyorg.BootstrapDemo.service;

import com.cyorg.BootstrapDemo.entity.Person;
import com.cyorg.BootstrapDemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yorga on 13-05-2017.
 */
@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Iterable<Person> findAllPersons()    {
        return personRepository.findAll();
    }

    public void addPerson(Person person)    {
        personRepository.save(person);
    }

}

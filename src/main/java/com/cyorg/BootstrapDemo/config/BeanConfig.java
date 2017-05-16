package com.cyorg.BootstrapDemo.config;

import com.cyorg.BootstrapDemo.entity.Person;
import com.cyorg.BootstrapDemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import sun.tools.jar.CommandLine;

/**
 * Created by yorga on 13-05-2017.
 */
@Configuration
public class BeanConfig {
    @Autowired
    PersonRepository personRepository;


    @Bean
    CommandLineRunner commandLineRunner()   {
        return (args) ->{
            for(int i = 1 ; i<= 5 ; i++)    {
                personRepository.save(new Person("Yoga-"+i,23,"Chennai"));
            }
        };
    }
}

package com.cyorg.BootstrapDemo.repository;

import com.cyorg.BootstrapDemo.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yorga on 13-05-2017.
 */
public interface PersonRepository extends CrudRepository<Person,Long> {
}

package pl.akademiakodu.helloSpring.dao;

import pl.akademiakodu.helloSpring.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-07-31.
 */
public interface PersonDao {

    List<Person> findByLastName(String lastName);
    List<Person> findAll();
    Person findById(Long id);

}

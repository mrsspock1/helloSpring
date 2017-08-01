package pl.akademiakodu.helloSpring.dao;

import pl.akademiakodu.helloSpring.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-07-31.
 */
public class PersonDaoImpl implements PersonDao {

    private static List<Person> people = new ArrayList<>();

    static{
        people.add(new Person(1L,"Adam", "Kot"));
        people.add(new Person(2L, "Czesław", "Pióro"));
        people.add(new Person(3L, "Weronika", "Kot"));
        people.add(new Person(4L,"Ania", "Gręda"));
        people.add(new Person(5L, "Lukasz", "Żurek"));
    }
    @Override
    public List<Person> findByLastName(String lastName){
        List<Person> lastNames = new ArrayList<>();
        for(Person person: people) {
            if (person.getLastName().equals(lastName)){
                lastNames.add(person);
            }
        }
        return lastNames;
    }

    @Override
    public List<Person> findAll() {
        return people;
    }

    public Person findById(Long id){
        Person result = null;
        for(Person person: people){
            if(person.getId().longValue() == id.longValue()){ // bo long z duzej litery
                return person;
            }
        }
        return result;
    }

}

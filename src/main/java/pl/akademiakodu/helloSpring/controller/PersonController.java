package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.helloSpring.dao.PersonDao;
import pl.akademiakodu.helloSpring.dao.PersonDaoImpl;
import pl.akademiakodu.helloSpring.model.Person;


/**
 * Created by Agnieszka on 2017-07-28.
 */
@Controller
public class PersonController {
    private PersonDao personDao = new PersonDaoImpl();

    @GetMapping("/person/formularz")
    public String add() {
        return "person/formularz";
    }

    @PostMapping("/person/create")
    public String create(@ModelAttribute Person person, ModelMap modelMap) {
        System.out.println(person);
        modelMap.addAttribute("person", person);
        return "person/show";
    }

    @GetMapping("/person/search")
    public String search() {
        return "person/search";
    }

    @GetMapping("/person/results")
    public String results(@ModelAttribute Person person, ModelMap modelMap) {
        System.out.println("Parameter " + person.getLastName());
        String lastName = person.getLastName();
            modelMap.addAttribute("people", personDao.findByLastName(lastName));
            return "person/results";
    }
        @GetMapping("/person/all")
        public String all(ModelMap modelMap){
                modelMap.addAttribute("people", personDao.findAll());
                return "person/all";
            }

            @GetMapping("/person/{id}")
            public String display(@PathVariable long id, ModelMap modelMap){
                modelMap.addAttribute("people", personDao.findById(id));
                return "person/results";
            }

        }

        // modelmap - odbiera dane; hashMap - ma klucz i wartosc
        // kontroler musi miec adnotacje controller
        // @GetMapping - metoda http, parametr jest wrzucany do url
        // jeśli PostMapping, parametr nie jest wrzucany do url
        // metoda kontrolera - akcja




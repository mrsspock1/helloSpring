package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.helloSpring.model.Book;
import pl.akademiakodu.helloSpring.model.Lotto;
import pl.akademiakodu.helloSpring.model.Person;

import java.util.*;


@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(ModelMap modelMap){
        modelMap.addAttribute("person", "aga");
        return "hello";
    }
    @ResponseBody
    @GetMapping("/hello")
    public String helloAga(){
        return "Hello Aga";
    }


    @GetMapping("/random")
    public String getRandom(ModelMap modelMap){
        modelMap.addAttribute("numbers", Lotto.getRandomNumbers());
        return "random";
    }


}

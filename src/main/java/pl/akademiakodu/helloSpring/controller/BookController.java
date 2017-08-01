package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.helloSpring.dao.BookDao;
import pl.akademiakodu.helloSpring.model.Book;

import java.util.List;


/**
 * Created by Agnieszka on 2017-07-27.
 */
@Controller
public class BookController {

    @GetMapping("/loop")
    public String listBooks(ModelMap modelMap){
        modelMap.addAttribute("books", BookDao.findAll());
        return "book/loop";
    }

//    @PostMapping("/create")
//    public String create(@ModelAttribute Book book, ModelMap modelMap){
//        System.out.println(book);
//        modelMap.addAttribute("book", book);
//        return "book/bookadd";
//    }

    @GetMapping("/bookadd")
    public String add(){
        return "book/bookadd";
    }
}

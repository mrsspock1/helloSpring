package pl.akademiakodu.helloSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.akademiakodu.helloSpring.model.Article;

import java.util.Scanner;

/**
 * Created by Agnieszka on 2017-07-27.
 */
@Controller
public class ArticleController {
    @GetMapping("/add")
    public String add(){
        return "article/add";
    }
    @GetMapping("/show")
        public String show(@ModelAttribute Article article, ModelMap modelMap){
        //title, body, category ---> new Article(title, body, category) dzięki adnotacji @ModelAttribute
        modelMap.addAttribute("article", article);
        return "article/show";
    }
}

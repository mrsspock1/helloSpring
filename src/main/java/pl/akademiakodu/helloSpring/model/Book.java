package pl.akademiakodu.helloSpring.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-07-27.
 */
public class Book {
    private String title;
    private String author;
    private Double price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String toString(){
        return getTitle()+ ", " + getAuthor() + ", " + getPrice();
    }
}

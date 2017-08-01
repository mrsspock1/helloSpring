package pl.akademiakodu.helloSpring.dao;

import pl.akademiakodu.helloSpring.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Agnieszka on 2017-07-27.
 */
public class BookDao {
    public static List<Book> findAll(){
        List<Book> books = new ArrayList<>();
            books.add(new Book("Biesy", "Dostojewski", 64.99));
            books.add(new Book("Wichrowe wzgórza", "Bronte", 36.99));
            books.add(new Book("Ogniem i Mieczem", "Sienkiewicz", 30.00));
            books.add(new Book("Hamlet", "Szekspir", 21.90 ));
            books.add(new Book("Autostopem przez galaktykę", "Adams", 25.90));
            books.add(new Book("Blade Runner", "Dick", 18.90));
        return books;
    }
}

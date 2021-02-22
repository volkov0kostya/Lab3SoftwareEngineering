package com.example.Lab3SoftwareEngeneering.controller;


import com.example.Lab3SoftwareEngeneering.entity.Book;
import com.example.Lab3SoftwareEngeneering.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;


@RestController
@RequestMapping(path = "/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping
    public Collection<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping
    public Book postBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

// Test if server is working
//    @GetMapping
//    public String getBooks(){
//        return "Hello World!";
//    }

}



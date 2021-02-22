package com.example.Lab3SoftwareEngeneering.service;

import com.example.Lab3SoftwareEngeneering.DAO.BookDAO;
import com.example.Lab3SoftwareEngeneering.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;


    public Collection<Book> getBooks(){
        return bookDAO.getBooks();
    }

    public Book createBook(Book book){
        return bookDAO.createBook(book);
    }
}

package com.example.Lab3SoftwareEngeneering.DAO;

import com.example.Lab3SoftwareEngeneering.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
    // we can define methods like find by title or find by author


}

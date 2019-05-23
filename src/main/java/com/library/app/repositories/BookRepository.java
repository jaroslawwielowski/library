package com.library.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}

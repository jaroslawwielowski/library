package com.library.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.app.entities.Books;

public interface BookRepository  extends JpaRepository<Books, Long>{

}

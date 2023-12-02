package com.springBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBook.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}

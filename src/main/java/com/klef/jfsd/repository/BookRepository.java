package com.klef.jfsd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}

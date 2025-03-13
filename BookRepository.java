package com.example.bookinventory.repository;

import com.example.bookinventory.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // ✅ Add this annotation
public interface BookRepository extends JpaRepository<Book, Long> { }

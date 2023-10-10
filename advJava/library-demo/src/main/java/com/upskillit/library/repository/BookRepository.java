package com.upskillit.library.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upskillit.library.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>
{

}

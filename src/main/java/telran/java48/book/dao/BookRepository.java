package telran.java48.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import telran.java48.book.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {

}

package telran.java48.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java48.book.dto.AuthorDto;
import telran.java48.book.dto.BookDto;
import telran.java48.book.service.BookService;

@RestController
@RequiredArgsConstructor
public class BookController {
	final BookService bookService;
	
	
	@PostMapping("/book")
	public boolean addBook(@RequestBody BookDto bookDto) {
		
		return bookService.addBook(bookDto);
	}

	@GetMapping("/book/{isbn}")
	public BookDto findBookByIsbn(@PathVariable String isbn) {
		
		return bookService.findBookByIsbn(isbn);
	}

	
	public BookDto remove(String isbn) {
		
		return null;
	}

	
	public BookDto updateBook(String isbn, String title) {
		
		return null;
	}

	
	public Iterable<BookDto> findBooksByAuthor(String authorName) {
		
		return null;
	}

	
	public Iterable<BookDto> findBooksByPublisher(String publisherName) {
		
		return null;
	}

	
	public Iterable<AuthorDto> findBookAuthors(String isbn) {
		
		return null;
	}

	
	public Iterable<String> findPublishersByAuthor(String authorName) {
		
		return null;
	}

	
	public AuthorDto removeAuthor(String authorName) {
		
		return null;
	}

}

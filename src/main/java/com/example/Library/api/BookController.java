package com.example.Library.api;

import com.example.Library.model.Book;
import com.example.Library.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/book")
@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    };

    @GetMapping
    public List<Book> getAllBooks(){
        //return reservationService.getReservations();
        return List.of();
    };
    @GetMapping(path = "/{id}")
    public Book getBookById(@PathVariable("id") Long id){
        //return bookService.getBookById(id).orElse(null);
        return new Book();
    }
    @PostMapping
    public void addBook(@Valid @NonNull @RequestBody Book book){
        //bookService.addBook(book);
    };
    @DeleteMapping(path = "/{id}")
    public void deleteBookById(@PathVariable("id") Long id){
        //bookService.deleteBook(id);
    }

    @PutMapping(path = "/{id}")
    public void updateBook(@PathVariable("id") Long id, @Valid @NonNull @RequestBody Book book){
        //bookService.updateBook(id, person);
    }

}

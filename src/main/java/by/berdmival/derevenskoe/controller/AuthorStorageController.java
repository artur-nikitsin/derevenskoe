package by.berdmival.derevenskoe.controller;

import by.berdmival.derevenskoe.entity.book.Author;
import by.berdmival.derevenskoe.service.book.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorStorageController {

    @Autowired
    AuthorService authorService;

    @GetMapping(path = "/authors")
    ResponseEntity<List<Author>> getAllAuthors() {
        return ResponseEntity.ok(authorService.findAll());
    }

    @PostMapping(path = "/authors")
    ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorService.saveOne(author));
    }

    @PutMapping(path = "/authors/{authorId}")
    ResponseEntity<Author> updateAuthor(@RequestBody Author author, @PathVariable("authorId") Long authorId) {
        author.setId(authorId);
        return ResponseEntity.ok(authorService.saveOne(author));
    }

    @GetMapping(path = "/authors/{authorId}")
    ResponseEntity<Author> getAuthorById(@PathVariable("authorId") Long authorId) {
        Author author = authorService.findById(authorId);
        if (author.getId() == authorId) {
            return ResponseEntity.ok(author);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping(path = "/authors/{authorId}")
    void deleteAuthorById(@PathVariable("authorId") Long authorId) {
        authorService.deleteOneById(authorId);
    }

    @DeleteMapping(path = "/authors")
    void deleteAuthor(@RequestBody Author author) {
        authorService.deleteOne(author);
    }

}

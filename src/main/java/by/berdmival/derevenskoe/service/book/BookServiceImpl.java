package by.berdmival.derevenskoe.service.book;

import by.berdmival.derevenskoe.entity.book.Author;
import by.berdmival.derevenskoe.entity.book.Book;
import by.berdmival.derevenskoe.entity.book.Genre;
import by.berdmival.derevenskoe.repository.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("bookService")
@Repository
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveOne(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> saveSeveral(List<Book> books) {
        return bookRepository.saveAll(books);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        Optional<Book> searchResult = bookRepository.findById(id);
        return searchResult.orElseGet(Book::new);
    }

    @Override
    public List<Book> findBooksByAuthor(Author author) {
        return bookRepository.getBooksByAuthorsContains(author);
    }

    @Override
    public List<Book> findBooksByGenre(Genre genre) {
        return bookRepository.getBooksByGenresContains(genre);
    }

    @Override
    public void deleteOne(Book book) {
        bookRepository.delete(book);
    }

    @Override
    public void deleteOneById(Long id) {
        bookRepository.deleteById(id);
    }
}

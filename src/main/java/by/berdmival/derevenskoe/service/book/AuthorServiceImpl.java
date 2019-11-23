package by.berdmival.derevenskoe.service.book;

import by.berdmival.derevenskoe.entity.book.Author;
import by.berdmival.derevenskoe.repository.book.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("authorService")
@Repository
@Transactional
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author saveOne(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public List<Author> saveSeveral(List<Author> authors) {
        return authorRepository.saveAll(authors);
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(Long id) {
        Optional<Author> searchResult = authorRepository.findById(id);
        return searchResult.orElseGet(Author::new);
    }

    @Override
    public void deleteOne(Author author) {
        authorRepository.delete(author);
    }

    @Override
    public void deleteOneById(Long id) {
        authorRepository.deleteById(id);
    }
}

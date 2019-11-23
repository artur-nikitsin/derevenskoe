package by.berdmival.derevenskoe.repository.book;

import by.berdmival.derevenskoe.entity.book.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}

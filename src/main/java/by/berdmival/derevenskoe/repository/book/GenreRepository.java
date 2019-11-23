package by.berdmival.derevenskoe.repository.book;

import by.berdmival.derevenskoe.entity.book.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}

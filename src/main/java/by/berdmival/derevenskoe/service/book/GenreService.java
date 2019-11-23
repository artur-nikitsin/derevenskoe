package by.berdmival.derevenskoe.service.book;

import by.berdmival.derevenskoe.entity.book.Genre;

import java.util.List;

public interface GenreService {
    Genre saveOne(Genre genre);

    List<Genre> saveSeveral(List<Genre> genres);

    List<Genre> findAll();

    Genre findById(Long id);

    void deleteOne(Genre genre);

    void deleteOneById(Long id);
}

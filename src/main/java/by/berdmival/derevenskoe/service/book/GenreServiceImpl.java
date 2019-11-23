package by.berdmival.derevenskoe.service.book;

import by.berdmival.derevenskoe.entity.book.Genre;
import by.berdmival.derevenskoe.repository.book.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("genreService")
@Repository
@Transactional
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public Genre saveOne(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public List<Genre> saveSeveral(List<Genre> genres) {
        return genreRepository.saveAll(genres);
    }

    @Override
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    @Override
    public Genre findById(Long id) {
        Optional<Genre> searchResult = genreRepository.findById(id);
        return searchResult.orElseGet(Genre::new);
    }

    @Override
    public void deleteOne(Genre genre) {
        genreRepository.delete(genre);
    }

    @Override
    public void deleteOneById(Long id) {
        genreRepository.deleteById(id);
    }
}

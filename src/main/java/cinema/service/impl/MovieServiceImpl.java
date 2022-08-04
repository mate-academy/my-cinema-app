package cinema.service.impl;

import cinema.dao.MovieDao;
import cinema.lib.Inject;
import cinema.service.MovieService;
import java.util.List;
import cinema.lib.Service;
import cinema.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).get();
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}

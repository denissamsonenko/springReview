package by.itechart.movie.repository;

import by.itechart.movie.model.Movie;

import java.util.List;

public class DbMovieRepository implements MovieRepository {
    private final List<Movie> movies;

    public DbMovieRepository(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> findAll() {
        return movies;
    }
}

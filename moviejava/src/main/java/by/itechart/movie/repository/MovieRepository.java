package by.itechart.movie.repository;

import by.itechart.movie.model.Movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> findAll();
}

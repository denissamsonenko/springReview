package by.itechart.movie.service;

import by.itechart.movie.model.Movie;
import by.itechart.movie.repository.MovieRepository;

import java.util.List;

public class MovieReport {
    private final MovieRepository repository;

    public MovieReport(MovieRepository repository) {
        this.repository = repository;
    }

    public void generate() {
        List<Movie> movie = repository.findAll();
        movie.forEach(System.out::println);
    }
}

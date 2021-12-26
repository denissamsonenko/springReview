package by.itechart.movie.config;

import by.itechart.movie.model.Movie;
import by.itechart.movie.repository.DbMovieRepository;
import by.itechart.movie.repository.MovieRepository;
import by.itechart.movie.service.MovieReport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Movie> movies() {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Matrix", "fantasy"));
        list.add(new Movie("Robocop", "action"));
        list.add(new Movie("Terminator", "action"));

        return list;
    }

    @Bean
    public MovieRepository movieRepository() {
        return new DbMovieRepository(movies());
    }

    @Bean
    public MovieReport movieReport() {
        return new MovieReport(movieRepository());
    }
}

package by.itechart.movie;

import by.itechart.movie.config.AppConfig;
import by.itechart.movie.service.MovieReport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        MovieReport movieRepoJava = ctx.getBean(MovieReport.class);
        movieRepoJava.generate();
    }
}

package by.itechart.movie;

import by.itechart.movie.service.MovieReport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        MovieReport movieRepoXML = ctx.getBean("report", MovieReport.class);
        movieRepoXML.generate();
    }
}

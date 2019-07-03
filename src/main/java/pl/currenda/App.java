package main.java.pl.currenda;

import java.util.List;

public class App {

    void run() {

        List<String> moviesList;
        String movie;
        boolean youWon = false;
        Movies movies = new Movies();
        Guessing guessing = new Guessing();

        moviesList = movies.readMovies();
        if (moviesList == null) return;

        movie = movies.getRandomMovie(moviesList);

        youWon = guessing.beginGeussing(movie);

        String message = "Niestety przegrałeś.";
        if (youWon) message = "Wygrałeś!";

        System.out.println(message);

    }
}

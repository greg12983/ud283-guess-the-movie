package main.java.pl.currenda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Movies {

    List<String> readMovies() {

        List<String> movies = new ArrayList<>();

        try {
            movies = Files.readAllLines(Paths.get("src", "main", "resources", "movies.txt"));
        } catch (
                IOException e) {
            System.out.println("File not found");
            return null;
        }
        return movies;

    }

    String getRandomMovie(List<String> moviesList) {
        int randomMovie = (int) (Math.random() * moviesList.size());
        return moviesList.get(randomMovie);
    }

}

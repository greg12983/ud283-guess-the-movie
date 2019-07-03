package main.java.pl.currenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guessing {

    boolean beginGeussing(String movie) {

        int maxNumberOfWrongGuesses = 10;
        int wrongGuesses = 0;
        boolean youWon = false;
        List<String> goodLetters = new ArrayList<>();
        List<String> wrongLetters = new ArrayList<>();

        String displayWord = movie.replaceAll(".", "_");
        //System.out.println("Zgadujesz film:" + movie);

        while (wrongGuesses < maxNumberOfWrongGuesses) {

            System.out.println("Zgadujesz następujący tytuł filmu:" + displayWord);
            System.out.println("Dotychczasowe błędne litery (" + wrongLetters.size() + "): " + String.join("", wrongLetters));
            System.out.println("Wpisz literę:");
            Scanner scanner = new Scanner(System.in);
            String letter = scanner.nextLine();

            if (movie.contains(letter)) {
                goodLetters.add(letter);
            } else {
                wrongLetters.add(letter);
                wrongGuesses++;
            }

            if (!goodLetters.isEmpty()) {
                displayWord = movie.replaceAll("[^" + goodLetters.toString() + "]", "_");
            }

            if (movie.equals(displayWord)) {
                youWon = true;
                break;
            }
        }

        return youWon;
    }
}
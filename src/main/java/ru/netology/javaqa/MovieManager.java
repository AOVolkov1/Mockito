package ru.netology.javaqa;

public class MovieManager {
    private String[] movies = new String[0];
    private int numberOfDisplayed;

    public MovieManager() {
        this.numberOfDisplayed = 5;
    }

    public MovieManager(int numberOfDisplayed) {
        this.numberOfDisplayed = numberOfDisplayed;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < numberOfDisplayed) {
            resultLength = movies.length;
        } else {
            resultLength = numberOfDisplayed;
        }

        String[] last = new String[resultLength];
        for (int i = 0; i < last.length; i++) {
            last[i] = movies[movies.length - 1 - i]; // заполняем result из массива, что лежит в поле
        }                                            // в обратном порядке
        return last;
    }
}

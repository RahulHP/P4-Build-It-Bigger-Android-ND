package com.wordpress.rahulhp.backend;

import com.example.JokeJava;

/**
 * The object model for the data we are sending through endpoints
 */
public class myJoke {
    public myJoke() {
        JokeJava joke = new JokeJava();
        this.jokeString = joke.getJoke();
    }

    private String jokeString;

    public String getData() {
        return jokeString;
    }

}
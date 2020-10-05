package com.example.assignment1.Model;

public class MoviesFactory {
    public IMoviesDA getModel(){

        return  new MoviesDA();
    }
}

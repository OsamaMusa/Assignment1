package com.example.assignment1.Model;

import java.util.ArrayList;
import java.util.List;

public interface IMoviesDA {
    public List<Movie> getMovies(String typeOfSearch , String key);

    String[] getTypesOfSearch();
}

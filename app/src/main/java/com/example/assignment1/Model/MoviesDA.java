package com.example.assignment1.Model;

import java.util.ArrayList;
import java.util.List;

  class MoviesDA implements IMoviesDA{
    ArrayList<Movie> Movies;
    public MoviesDA() {
       Movies = new ArrayList<>();
       Movies.add(
               new Movie("Drag Me to Hell",2009,"Horror",99,"USA")
       );
        Movies.add(
                new Movie("Valley Girl",2020,"Comedy",102,"USA")
        );
        Movies.add(
                new Movie("I Used to Go Here",2020,"Comedy",80,"Kanada")
        );
        Movies.add(
                new Movie("First Cow",2019,"Drama",122,"USA")
        );
        Movies.add(
                new Movie("The Tax Collector",2019,"Action",95,"USA")
        );
    }

      @Override
      public  List<Movie> getMovies(String typeOfSearch , String key) {
          ArrayList<Movie> result = new ArrayList<>();
          if(typeOfSearch.equals("Title")){
              for (Movie movie :Movies ){
                  if(movie.getTitle().contains(key))
                      result.add(movie);
              }
          }else if(typeOfSearch.equals("Year")){
              try {
                  for (Movie movie :Movies ){
                      if (movie.getYear() == Integer.valueOf(key) ){
                          result.add(movie);
                      }
                  }
              }catch (NumberFormatException ex){
                  return result;
              }
          }else if(typeOfSearch.equals("Genre")){
              for (Movie movie :Movies ){
                  if(movie.getGenre().contains(key))
                      result.add(movie);
              }
          }else if(typeOfSearch.equals("Time")){
              try {
                  for (Movie movie :Movies ){
                      if (movie.getTime() == Integer.valueOf(key) ){
                          result.add(movie);
                      }
                  }
              }catch (NumberFormatException ex){
                  return result;
              }

          }else{
              for (Movie movie :Movies ){
                  if(movie.getCountry().contains(key))
                      result.add(movie);
              }
          }

          return  result;
      }

      @Override
      public String[] getTypesOfSearch() {
          String [] res = {"Title","Year","Genre","Time","Contry" };
          return  res;
      }
  }

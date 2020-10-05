package com.example.assignment1.Model;

 public class Movie {
    private  String title;
    private  int year;
    private String genre;
    private int time;
    private String Country;

     public Movie(String title, int year, String genre, int time, String country) {
         this.title = title;
         this.year = year;
         this.genre = genre;
         this.time = time;
         Country = country;
     }

     public void setTime(int time) {
         this.time = time;
     }

     public void setCountry(String country) {
         Country = country;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     public void setYear(int year) {
         this.year = year;
     }

     public void setGenre(String genre) {
         this.genre = genre;
     }

     public String getTitle() {
         return title;
     }

     public int getYear() {
         return year;
     }

     public String getGenre() {
         return genre;
     }

     public int getTime() {
         return time;
     }

     public String getCountry() {
         return Country;
     }

     @Override
     public String toString() {
         return "Movie{" +
                 "title='" + title + '\'' +
                 ", year=" + year +
                 ", genre='" + genre + '\'' +
                 ", time=" + time +
                 ", Country='" + Country + '\'' +
                 '}';
     }
 }

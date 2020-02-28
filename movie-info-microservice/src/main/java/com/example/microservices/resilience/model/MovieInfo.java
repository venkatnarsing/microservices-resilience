package com.example.microservices.resilience.model;

public class MovieInfo {
    private String movieId;
    private String movieName;
    private Integer rating;

    public MovieInfo(){}

    public MovieInfo(String movieId, String movieName, Integer rating){
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}

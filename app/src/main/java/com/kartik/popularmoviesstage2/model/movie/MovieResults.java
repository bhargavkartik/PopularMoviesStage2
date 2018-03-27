package com.kartik.popularmoviesstage2.model.movie;

import com.kartik.popularmoviesstage2.model.movie.Movie;

import java.util.List;

public class MovieResults {
    private List<Movie> results;

    public MovieResults() {
    }

    public MovieResults(List<Movie> results) {
        this.results = results;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }
}

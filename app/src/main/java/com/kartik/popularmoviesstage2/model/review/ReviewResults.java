package com.kartik.popularmoviesstage2.model.review;

import com.kartik.popularmoviesstage2.model.review.Review;

import java.util.List;

public class ReviewResults {
    private List<Review> results;

    public ReviewResults(){}

    public ReviewResults(List<Review> results) {
        this.results = results;
    }

    public List<Review> getResults() {
        return results;
    }

    public void setResults(List<Review> results) {
        this.results = results;
    }
}

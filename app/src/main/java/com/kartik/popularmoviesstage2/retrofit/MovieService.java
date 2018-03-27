package com.kartik.popularmoviesstage2.retrofit;

import com.kartik.popularmoviesstage2.model.review.ReviewResults;
import com.kartik.popularmoviesstage2.model.movie.MovieResults;
import com.kartik.popularmoviesstage2.model.trailer.TrailerResults;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MovieService {
    @GET("3/movie/{endpoint}")
    Call<MovieResults> getMovies(@Path("endpoint") String endpoint, @Query("api_key") String api_key, @Query("page") int page);

    @GET("3/movie/{movie_id}/reviews")
    Call<ReviewResults> getReviews(@Path("movie_id") String movieId, @Query("api_key") String api_key);

    @GET("3/movie/{movie_id}/videos")
    Call<TrailerResults> getTrailers(@Path("movie_id") String movieId, @Query("api_key") String api_key);
}
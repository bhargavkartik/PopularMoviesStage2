package com.kartik.popularmoviesstage2.ui.recycler_view;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kartik.popularmoviesstage2.R;
import com.kartik.popularmoviesstage2.model.movie.Movie;
import com.kartik.popularmoviesstage2.ui.MainActivity;
import com.kartik.popularmoviesstage2.ui.MovieDetailsActivity;

import java.util.ArrayList;

public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView m_movieTitle;
    ImageView m_moviePosterThumbnail;
    ImageView m_favoriteStar;

    MovieViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        m_movieTitle = itemView.findViewById(R.id.movie_title);
        m_moviePosterThumbnail = itemView.findViewById(R.id.movie_poster_thumbnail);
        m_favoriteStar = itemView.findViewById(R.id.favoriteStar);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), MovieDetailsActivity.class);
        intent.putExtra(MovieDetailsActivity.MOVIE_PARCEL, ((ArrayList<Movie>) itemView.getTag()).get(getAdapterPosition()));
        ((MainActivity)v.getContext()).startActivityForResult(intent,123);
    }
}
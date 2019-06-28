package com.example.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel // annotation indicates class is Parcelable
public class Movie {

    private String title;
    private String overview;
    private String posterPath;
    private String backdropPath;
    private String releaseDate;
    Double voteAverage;

    public Movie(){}


    public  Movie(JSONObject movie) throws JSONException {
        title = movie.getString("title");
        overview = movie.getString("overview");
        posterPath = movie.getString("poster_path");
        backdropPath = movie.getString("backdrop_path");
        voteAverage = movie.getDouble("vote_average");
        releaseDate = movie.getString("release_date");

    }

    public String getTitle() {

        return title;
    }

    public String getOverview() {

        return overview;
    }

    public String getPosterPath() {

        return posterPath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public String getReleaseDate() {
        return releaseDate;
    }
}

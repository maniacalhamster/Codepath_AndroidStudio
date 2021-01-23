package com.example.flixter.model;

import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Movie {

    String baseImageUrl = "https://image.tmdb.org/t/p/%s%s";
    String posterWidth = "w500";
    String backdropWidth = "w780";
    String posterPath;
    String backdropPath;
    String title;
    String overview;
    double rating;

    // empty constructor needed by Parceler Library
    public Movie() {}
    public Movie(JSONObject jsonObject) throws JSONException {
        posterPath = jsonObject.getString("poster_path");
        backdropPath = jsonObject.getString("backdrop_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
        rating = jsonObject.getDouble("vote_average");
    }

    public static List<Movie> fromJsonArray(JSONArray movieJsonArray) throws JSONException {
        List<Movie> movies = new ArrayList<>();
        for (int i=0; i<movieJsonArray.length(); i++) {
            movies.add(new Movie(movieJsonArray.getJSONObject(i)));
        }
        return movies;
    }

    public String getPosterPath() {
        return String.format(baseImageUrl, posterWidth, posterPath);
    }
    public String getBackdropPath() { return String.format(baseImageUrl, backdropWidth, backdropPath); }
    public String getTitle() {
        return title;
    }
    public String getOverview() {
        return overview;
    }
    public double getRating() { return rating; }
}

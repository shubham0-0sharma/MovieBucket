package com.moviebucket.moviebucket.service;

import com.moviebucket.moviebucket.collection.Movie;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    Optional<Movie> getAMovie(String imdbId);
}

package com.moviebucket.moviebucket.service.serviceImpl;

import com.moviebucket.moviebucket.collection.Movie;
import com.moviebucket.moviebucket.repository.MovieRepository;
import com.moviebucket.moviebucket.service.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll() ;
    }

    @Override
    public Optional<Movie> getAMovie(String imdbId) {
        return  movieRepository.findByImdbId(imdbId);
    }
}

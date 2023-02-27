package com.moviebucket.moviebucket.service.serviceImpl;

import com.moviebucket.moviebucket.collection.Movie;
import com.moviebucket.moviebucket.collection.Review;
import com.moviebucket.moviebucket.repository.MovieRepository;
import com.moviebucket.moviebucket.repository.ReviewRepository;
import com.moviebucket.moviebucket.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private ReviewRepository reviewRepository;


    @Override
    public Review addReview(String imdbId, String reviewBody) {
        Review review = new Review();

       return  null;
    }
}

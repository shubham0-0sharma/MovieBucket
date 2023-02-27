package com.moviebucket.moviebucket.service.serviceImpl;

import com.moviebucket.moviebucket.collection.Movie;
import com.moviebucket.moviebucket.collection.Review;

import com.moviebucket.moviebucket.repository.ReviewRepository;
import com.moviebucket.moviebucket.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private ReviewRepository reviewRepository;


    @Override
    public Review addReview(String imdbId, String reviewBody) {
        Review review = reviewRepository.insert(new Review(reviewBody));

        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

       return  review;
    }
}

package com.moviebucket.moviebucket.service;

import com.moviebucket.moviebucket.collection.Review;

public interface ReviewService {
    Review addReview(String imdbId , String reviewBody);
}

package com.moviebucket.moviebucket.controller;

import com.moviebucket.moviebucket.collection.Review;
import com.moviebucket.moviebucket.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/movie/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;



    public ResponseEntity<Review> addReview(@PathVariable String imdbId , @RequestBody String reviewBody){
        return new ResponseEntity<>(reviewService.addReview(imdbId, reviewBody), HttpStatus.CREATED);
    }
}

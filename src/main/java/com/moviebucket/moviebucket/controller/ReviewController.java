package com.moviebucket.moviebucket.controller;

import com.moviebucket.moviebucket.collection.Review;
import com.moviebucket.moviebucket.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;


    @PostMapping
    public ResponseEntity<Review> addReview( @RequestBody Map<String ,String> payload){
        return new ResponseEntity<>(reviewService.addReview(payload.get("imdbId"), payload.get("reviewBody")), HttpStatus.CREATED);
    }
}

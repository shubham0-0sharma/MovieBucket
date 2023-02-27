package com.moviebucket.moviebucket.repository;

import com.moviebucket.moviebucket.collection.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}

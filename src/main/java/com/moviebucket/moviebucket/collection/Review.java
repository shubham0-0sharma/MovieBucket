package com.moviebucket.moviebucket.collection;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Review {
    @Id
private ObjectId id;
@NonNull
    private String body;

}

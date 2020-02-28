package com.example.microservices.resilience.resource;

import com.example.microservices.resilience.model.RatingData;
import com.example.microservices.resilience.model.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingDataResource {
    List<UserRating> userMovieRatings;

    @RequestMapping("/users/{userId}")
    public UserRating getMovieRating(@PathVariable String userId) {

        return userMovieRatings.stream().filter(rating -> rating.getUserId().equals(userId)).findFirst().get();
    }

    //Initialize User Movie Rating Data
    {
        List<RatingData> ratings1 = Arrays.asList(
                new RatingData("1", 5),
                new RatingData("2", 3),
                new RatingData("3", 1)
        );

        List<RatingData> ratings2 = Arrays.asList(
                new RatingData("1", 1),
                new RatingData("2", 3),
                new RatingData("3", 5)
        );
        userMovieRatings = Arrays.asList(new UserRating("1", ratings1), new UserRating("2", ratings2));
    }
}

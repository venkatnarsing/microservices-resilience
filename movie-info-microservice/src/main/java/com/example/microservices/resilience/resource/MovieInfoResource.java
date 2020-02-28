package com.example.microservices.resilience.resource;

import com.example.microservices.resilience.model.MovieCatalog;
import com.example.microservices.resilience.model.MovieInfo;
import com.example.microservices.resilience.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class MovieInfoResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<MovieInfo> getMovieInfo(@PathVariable String userId){
        UserRating userRating = restTemplate.getForObject("http://rating-data-service/ratings/users/" + userId, UserRating.class);

        return userRating.getRatings().stream().map(rating -> {
            MovieCatalog movie = restTemplate.getForObject("http://movie-catalog-service/movies/" + rating.getMovieId(), MovieCatalog.class);
            return new MovieInfo(movie.getId(), movie.getName(), rating.getRating());
        }).collect(Collectors.toList());
    }
}

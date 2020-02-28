package com.example.microservices.resilience.resource;

import com.example.microservices.resilience.model.MovieCatalog;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MoviesCatalogResource {

	@RequestMapping("/movies/{movieId}")
	public MovieCatalog getMoviesCatalog(@PathVariable String movieId) {
		List<MovieCatalog> movies = Arrays.asList(
				new MovieCatalog("1", "Transformers"),
				new MovieCatalog("2", "Avatar"),
				new MovieCatalog("3", "Baahubali")
		);

		return movies.stream().filter(movie -> movie.getId().equals(movieId)).findFirst().get();
	}
}

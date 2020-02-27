package com.example.microserviceresilience;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MoviesCatalogController {

	@RequestMapping("/movies/{userId}")
	public List<MovieCatalog> getMoviesCatalog(@PathVariable String userId) {

		List<MovieCatalog> movies = new ArrayList<MovieCatalog>();
		movies.add(new MovieCatalog("1", "Movie 100"));
		movies.add(new MovieCatalog("2", "Movie 200"));

		return movies;
	}
}

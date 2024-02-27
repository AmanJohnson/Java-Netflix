package com.example.demoflix.service;

import com.example.demoflix.model.Movie;
import java.util.List;

public interface MovieService {
    List<Movie> findAllMovies();

    Movie findMovieById(Long id);

    Movie saveMovie(Movie movie);
}

package com.example.demoflix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demoflix.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}

package com.ssotter.ssmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssotter.ssmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{


}

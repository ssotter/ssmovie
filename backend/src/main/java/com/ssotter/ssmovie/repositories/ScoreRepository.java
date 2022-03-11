package com.ssotter.ssmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssotter.ssmovie.entities.Score;
import com.ssotter.ssmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{


}

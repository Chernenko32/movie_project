package com.example.movie_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie_project.entity.Movie;


@Repository
public interface MovieDao extends JpaRepository<Movie, String> {

}

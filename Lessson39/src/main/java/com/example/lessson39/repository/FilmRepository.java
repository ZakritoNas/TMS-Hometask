package com.example.lessson39.repository;


import com.example.lessson39.domain.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FilmRepository extends JpaRepository<FilmEntity, Integer> {
}

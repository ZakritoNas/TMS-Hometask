package com.example.lesson41.service;

import com.example.lesson41.domain.FilmEntity;
import com.example.lesson41.dto.FilmSearchDto;

import javax.transaction.Transactional;
import java.util.List;

public interface FilmService {
    List<FilmEntity> findAll();
    void save (FilmEntity film);
    @Transactional
    void updateRating(Integer id, Integer rating);
    List<FilmEntity> findByCriteria(FilmSearchDto searchDto);
}

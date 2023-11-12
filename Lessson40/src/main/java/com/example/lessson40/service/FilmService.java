package com.example.lessson40.service;


import com.example.lessson40.domain.FilmEntity;

import java.util.List;

public interface FilmService {

    List<FilmEntity> findAll();

    void save (FilmEntity film);

    void updateRating(Integer id, Integer rating);
}

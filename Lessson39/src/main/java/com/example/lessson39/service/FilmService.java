package com.example.lessson39.service;


import com.example.lessson39.domain.FilmEntity;

import java.util.List;

public interface FilmService {
    List<FilmEntity> findAll();

    void save (FilmEntity film);
}

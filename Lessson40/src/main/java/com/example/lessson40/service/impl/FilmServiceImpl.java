package com.example.lessson40.service.impl;

import com.example.lessson40.domain.FilmEntity;
import com.example.lessson40.repository.FilmRepository;
import com.example.lessson40.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor

@Service
public class FilmServiceImpl implements FilmService {
    private final FilmRepository repository;

    @Override
    public List<FilmEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(FilmEntity film) {
        repository.save(film);
    }

    @Override
    public void updateRating(Integer id, Integer rating) {
        repository.updateRating(id, rating);
    }
}

package com.example.lesson41.service.impl;

import com.example.lesson41.domain.FilmEntity;
import com.example.lesson41.domain.Genres;
import com.example.lesson41.dto.FilmSearchDto;
import com.example.lesson41.repository.FilmRepository;
import com.example.lesson41.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Date;
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

    @Override
    public List<FilmEntity> findByCriteria(FilmSearchDto dto) {
        return repository.findAll(createSpecif(dto));
    }

    private Specification<FilmEntity>  createSpecif(FilmSearchDto searchDto){
        return (root, query, builder) -> {
            String name = searchDto.getName();
            Genres genre = searchDto.getGenre();
            Date date = searchDto.getDateOfIssue();
            Integer rating = searchDto.getRating();

            var predicates = new ArrayList<Predicate>();

            if (name != null && !name.isBlank()){
                Predicate nameEq = builder.equal(root.get("name"), name);
                predicates.add(nameEq);
            }
            if (genre != null){
                Predicate genreEq = builder.equal(root.get("genre"), genre);
                predicates.add(genreEq);
            }
            if (date != null){
                Predicate dateEq = builder.equal(root.get("date"), date);
                predicates.add(dateEq);
            }
            if (rating != null){
                Predicate ratingEq = builder.equal(root.get("rating"), rating);
                predicates.add(ratingEq);
            }

            Predicate[] array = predicates.toArray(Predicate[]::new);
            return builder.and(array);
        };
    }
}

package com.example.lessson40.repository;


import com.example.lessson40.domain.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Optional;
@Component
public interface FilmRepository extends JpaRepository<FilmEntity, Integer> {
    @Modifying
    @Transactional
    Optional<FilmEntity> updateRating(Integer id, Integer rating);
}

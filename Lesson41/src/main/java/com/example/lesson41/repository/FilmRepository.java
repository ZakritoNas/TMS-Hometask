package com.example.lesson41.repository;

import com.example.lesson41.domain.FilmEntity;
import com.example.lesson41.domain.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Component
public interface FilmRepository extends JpaRepository<FilmEntity, Integer>, JpaSpecificationExecutor <FilmEntity> {
    @Modifying
    Optional<FilmEntity> updateRating(Integer id, Integer rating);

    List<FilmEntity> findByNameAndGenreAndDateOfIssueAndRating(String name, Genres genre, Date dateOfIssue, Integer rating);
}

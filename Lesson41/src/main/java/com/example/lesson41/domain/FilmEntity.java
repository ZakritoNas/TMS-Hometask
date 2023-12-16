package com.example.lesson41.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name="films2")
@NamedQuery(name = "FilmEntity.updateRating", query = "update FilmEntity set rating = :rating where id=:id")
public class FilmEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Genres genre;
    @Temporal(TemporalType.DATE)
    private Date dateOfIssue;
    private Integer rating;
}

package com.example.basic_news.search.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "search")
public class SearchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "post_created_at", nullable = false)
    private LocalDateTime postCreatedAt;

    @Column(name = "post_updated_at", nullable = false)
    private LocalDateTime postUpdatedAt;
}

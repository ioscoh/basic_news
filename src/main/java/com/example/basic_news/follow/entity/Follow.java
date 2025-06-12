package com.example.basic_news.follow.entity;

import com.example.basic_news.member.entity.Member;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "follow")
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "followed", nullable = false)
    private Member followedMember;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "following", nullable = false)
    private Member followingMember;

    @Column(name = "followed_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime followedAt;
}

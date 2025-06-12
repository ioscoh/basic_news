package com.example.basic_news.like.post_like.entity;

import com.example.basic_news.member.entity.MemberEntity;
import com.example.basic_news.post.entity.PostEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "post_like")
public class PostLikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private MemberEntity member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private PostEntity post;

    @Column(name = "liked_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime likedAt;
}

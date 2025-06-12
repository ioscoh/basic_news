package com.example.basic_news.like.entity;

import com.example.basic_news.comment.entity.Comment;
import com.example.basic_news.member.entity.Member;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment_like")
public class CommemtLike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id", nullable = false)
    private Comment comment;

    @Column(name = "liked_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime likedAt;
}


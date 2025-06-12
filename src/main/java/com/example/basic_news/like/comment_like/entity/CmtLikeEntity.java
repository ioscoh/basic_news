package com.example.basic_news.like.comment_like.entity;

import com.example.basic_news.member.entity.MemberEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment_like")
public class CmtLikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private MemberEntity member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id", nullable = false)
    private CmtLikeEntity comment;

    @Column(name = "liked_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime likedAt;
}

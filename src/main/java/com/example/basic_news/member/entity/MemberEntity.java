package com.example.basic_news.member.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    private Byte age;

    @Column(nullable = false, length = 100)
    private String content;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    @UpdateTimestamp
    private LocalDateTime updatedAt;

//    // 양방향 관계 설정
//    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
//    private List<Post> posts = new ArrayList<>();
//
//    @OneToMany(mappedBy = "followedMember")
//    private List<Follow> followers = new ArrayList<>();
//
//    @OneToMany(mappedBy = "followingMember")
//    private List<Follow> followings = new ArrayList<>();
//
//    @OneToMany(mappedBy = "member")
//    private List<PostLike> postLikes = new ArrayList<>();
//
//    @OneToMany(mappedBy = "member")
//    private List<CommentLike> commentLikes = new ArrayList<>();
}

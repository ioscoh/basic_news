package com.example.basic_news.post.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostListGetResponseDtoInsideDto {
    public PostListGetResponseDtoInsideDto(
            Long getid, String title, String content, Object createdAt
    ) {
    }

    public class postListGetResponseDtoInsideDto {
        private Long id;
        private String title;
        private String content;
        private LocalDateTime createdAt;




        //뉴스피드2
        public postListGetResponseDtoInsideDto(
                Long id, String title, String content, LocalDateTime createdAt
        ) {

            this.id = id;
            this.title = title;
            this.content = content;
            this.createdAt = createdAt;

        }

    }
    }


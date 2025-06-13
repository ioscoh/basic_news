package com.example.basic_news.post.dto;

import lombok.Getter;

@Getter
public class PostGetResponseDto {
    //속
    private Long id;
    private String title;
    private String content;

    //생

    public PostGetResponseDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;

    }
    //기

}

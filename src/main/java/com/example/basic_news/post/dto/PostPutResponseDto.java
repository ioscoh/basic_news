package com.example.basic_news.post.dto;

import lombok.Getter;

@Getter
public class PostPutResponseDto {
    //속
    private Long id;
    private String message;


    //생

    //엔티티에 저장된 값 응답할 때
    public PostPutResponseDto(Long id, String message) {
        this.id = id;
        this.message = message;
    }


    //기
}

package com.example.basic_news.post.dto;

import lombok.Getter;

@Getter
public class PostDeleteResponseDto {
    //속
    //값을 만들고 나면 읽기만 하는 클래스라 final 을 씁니다.
    private final String message;



    //생


    public PostDeleteResponseDto(String message) {

        this.message = message;
    }

    //기
}

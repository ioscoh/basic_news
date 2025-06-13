package com.example.basic_news.post.dto;

import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
public class PostPutRequestDto {
    //속
    @NotNull
    private String title;


    //생
    public PostPutRequestDto(String title) {
        this.title = title;
    }

    //기

    public String getTitle() {
        return title;
    }
}

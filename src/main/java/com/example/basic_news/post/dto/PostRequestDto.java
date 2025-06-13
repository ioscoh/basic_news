package com.example.basic_news.post.dto;

import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
public class PostRequestDto {
    //속
    @NotNull
    private String title;
    @NotNull
    private String content;


    //생
    public PostRequestDto() {

    }



    //기
    public String getTitle() {

        return title;
    }
    public String getContent() {

        return content;
    }
}

package com.example.basic_news.post.dto;

import java.util.ArrayList;
import java.util.List;

public class PostListGetResponseDto {
    private List<PostListGetResponseDtoInsideDto> listGetResponseDto = new ArrayList<>();;

    public PostListGetResponseDto(
            List<PostListGetResponseDtoInsideDto> listGetResponseDto
    ) {
        this.listGetResponseDto = listGetResponseDto;

    }
    public List<PostListGetResponseDtoInsideDto> getListGetResponseDto() {

        return listGetResponseDto;
    }
}

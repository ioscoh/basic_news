package com.example.basic_news.post.service;

import com.example.basic_news.post.dto.*;
import com.example.basic_news.post.entity.Post;
import com.example.basic_news.post.repository.PostRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostService {

    //속

    private final PostRepository postRepository;



    //생
    public PostService(PostRepository postRepository) {

        this.postRepository = postRepository;
    }




    //기

    //게시물 생성 기능
    @Transactional
    public PostResponseDto postCreateService(PostRequestDto postRequestDto) {

        //정보 부르기
        String title = postRequestDto.getTitle();
        String content = postRequestDto.getContent();

        //저장
        Post postEntity = new Post(title, content);

        Post savePostEntity = postRepository.save(postEntity);
        Long savedPostId = savePostEntity.getid();

        //응답

        return new  PostResponseDto(savedPostId, "게시물 등록 완료");


    }
    //게시물 단건 조회
    @Transactional(readOnly = true)
    public PostGetResponseDto postGetService(Long id) {
        Optional<Post> postOptionalById = postRepository.findById(id);

        if (postOptionalById.isPresent()) {
            Post foundId = postOptionalById.get();

            Long getId = foundId.getid();
            String getTitle = foundId.getTitle();
            String getContent = foundId.getContent();

            PostGetResponseDto getResponseDto = new PostGetResponseDto(getId, getTitle, getContent);
            return getResponseDto;

        } else {
            return null;
        }

    }

    //게시물 수정
    @Transactional
    public PostPutResponseDto postUpdateService(
            Long id,
            PostPutRequestDto postPutRequestDto

    ) {

        String title = postPutRequestDto.getTitle();

        Optional<Post> postRepositoryById = postRepository.findById(id);

        if (postRepositoryById.isPresent()) {
            Post foundId = postRepositoryById.get();

            foundId.setTitle(title);

            PostPutResponseDto postPutResponseDto = new  PostPutResponseDto(id, "게시물 수정 완료");
            return postPutResponseDto;


        } else {
            return null;
        }


    }


    //게시물 삭제
    @Transactional
    public PostDeleteResponseDto postDeleteService(Long id) {

        Optional<Post> postRepositoryById = postRepository.findById(id);

        if (postRepositoryById.isPresent()) {
            Post foundId = postRepositoryById.get();

            postRepository.delete(foundId);
            PostDeleteResponseDto postDeleteResponseDto = new PostDeleteResponseDto( "게시물 삭제 완료");
            return postDeleteResponseDto;

        } else {
            return null;
        }
    }

    //뉴스피드 조회
    public PostListGetResponseDto postListGetService() {

        List<Post> postEntityList = postRepository.findAll();

        List<PostListGetResponseDtoInsideDto> list = new ArrayList<>();



        for (Post post : postEntityList) {
            PostListGetResponseDtoInsideDto postListGetResponseDtoInsideDto = new PostListGetResponseDtoInsideDto(
                    post.getid(), post.getTitle(), post.getContent(), post.getCreated_at()
            );
            list.add(postListGetResponseDtoInsideDto);
        }
        PostListGetResponseDto postListGetResponseDto = new PostListGetResponseDto(list);
        return postListGetResponseDto;


    }
}

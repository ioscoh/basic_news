package com.example.basic_news.member.service;

import com.example.basic_news.member.dto.MemberJoinRequestDto;
import com.example.basic_news.member.dto.MemberJoinResponseDto;
import com.example.basic_news.member.repository.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MemberService {
    //속

    private final MemberRepository memberJoinRepository;



    //생

    public MemberService(MemberRepository memberJoinRepository) {
        this.memberJoinRepository = memberJoinRepository;
    }


    //기

    //회원가입시 이미 있는 이메일에 대한 제어를 위한 서비스 입니다.
    public MemberJoinResponseDto MemberJoin(MemberJoinRequestDto dto) {
       if (memberJoinRepository.findByEmail(dto.getEmail())) {
           throw new ResponseStatusException(
                   HttpStatus.BAD_REQUEST, "이미 사용 중인 e-mail 입니다."
           );
       }
       return MemberJoin(dto);

    }






}

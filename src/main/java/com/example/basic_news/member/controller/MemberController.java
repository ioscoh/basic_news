package com.example.basic_news.member.controller;

import com.example.basic_news.member.dto.MemberJoinRequestDto;
import com.example.basic_news.member.dto.MemberJoinResponseDto;
import com.example.basic_news.member.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {
    //속
    private final MemberService memberJoinService;



    //생
    public MemberController(MemberService memberJoinService) {
        this.memberJoinService = memberJoinService;
    }




    //기

    //회원가입시 이미 있는 이메일에 대한 제어를 위한 컨트롤러 입니다.
    public ResponseEntity<MemberJoinResponseDto> MemberJoin(
            @RequestBody @Validated MemberJoinRequestDto dto
            ) {
        MemberJoinResponseDto memberJoinResponseDto = memberJoinService.MemberJoin(dto);
        return ResponseEntity.status(HttpStatus.CONFLICT).body(memberJoinResponseDto);

    }



}

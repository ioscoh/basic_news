package com.example.basic_news.member.repository;

import com.example.basic_news.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    //속

    //생

    //기

    //회원가입시 이미 있는 이메일에 대한 제어를 위한 메소드 입니다,
    boolean findByEmail(String email);
    boolean existsByEmail(String email);
}

package com.sparta.hellospring;

import com.sparta.hellospring.repository.MemberRepository;
import com.sparta.hellospring.repository.MemoryMemberRepository;
import com.sparta.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}

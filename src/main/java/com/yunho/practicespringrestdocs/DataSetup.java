package com.yunho.practicespringrestdocs;

import java.util.ArrayList;
import java.util.List;

import com.yunho.practicespringrestdocs.member.Member;
import com.yunho.practicespringrestdocs.member.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataSetup implements ApplicationRunner {

    private final MemberRepository memberRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        final List<Member> members = new ArrayList<>();

        members.add(new Member("yun@bbb.com", "yun"));
        members.add(new Member("jin@bbb.com", "jin"));
        members.add(new Member("han@bbb.com", "han"));
        members.add(new Member("jo@bbb.com", "jo"));

        memberRepository.saveAll(members);
    }
}
package com.yunho.practicespringrestdocs.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;

@Getter
public class MemberSignUpRequest {

    @Email
    private String email;

    @NotEmpty
    private String name;

    public Member toEntity() {
        return new Member(email, name);
    }
}

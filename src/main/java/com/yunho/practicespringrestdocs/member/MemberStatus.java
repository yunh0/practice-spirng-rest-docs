package com.yunho.practicespringrestdocs.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum MemberStatus {
    LOCK("일시 정지"),
    NORMAL("정상"),
    BAN("영구 정지");

    private final String description;
}

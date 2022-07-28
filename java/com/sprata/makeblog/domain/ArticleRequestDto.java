package com.sprata.makeblog.domain;

import lombok.Getter;

@Getter
public class ArticleRequestDto {
    // Article 수정 요청을 받았을 때 필요한 것들
    // 제목, 작성자명, 비밀번호, 작성내용
    // private로 생성하면 가져올 때 문제가 생기니까 @Getter
    private String title;
    private String username;
    private String password;
    private String content;

}

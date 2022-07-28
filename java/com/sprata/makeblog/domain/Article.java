package com.sprata.makeblog.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity // 테이블과 연계됨을 알려줌
@NoArgsConstructor  // 기본 생성자를 만들고
public class Article extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String content;

    public Article(ArticleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.content = requestDto.getContent();
    }

    public void update(ArticleRequestDto requestDto){
        this.content = requestDto.getContent();
    }


}

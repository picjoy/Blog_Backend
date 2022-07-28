package com.sprata.makeblog.service;

import com.sprata.makeblog.domain.Article;
import com.sprata.makeblog.domain.ArticleRepository;
import com.sprata.makeblog.domain.ArticleRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

// 스프링에게 이 클래스는 서비스임을 명시
@Service
// RequiredArgsConstructor
// final 필드에 대해 생성자를 만들어주는 lombok의 annotation
// 초기화 되지않은 final 필드나, @NonNull 이 붙은 필드에 대해 생성자를 생성해 줍
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    @Transactional
    // repo를 이용해서 Id 이용해서 찾고 만약에 없으면 알려주기
    // Update할 때 필요한 것 : 업데이트할 대상의 Id와 업데이트할 내용을 정보
    public void update(Long id, ArticleRequestDto requestDto){
        Article article = articleRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 ID가 없습니다.")
        );
        //업데이트가 해주기
        article.update(requestDto);
    }

}

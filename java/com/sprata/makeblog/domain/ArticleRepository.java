package com.sprata.makeblog.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    //interface > 클래스에서 멤버 변수가 없는 메소드만 있는 것
    // 공동 작업시 충돌을 방지하기 위해서 사용=> 유연성 증가

    List<Article> findAllByOrderByModifiedAtDesc();
    //findAll By OrderBy ModifiedAt Desc
    // 다 찾아라 / 이 순으로 정렬을 해줘 / 수정한대로 / 내림차순(최신순)

}

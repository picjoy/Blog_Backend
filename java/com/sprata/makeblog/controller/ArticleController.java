package com.sprata.makeblog.controller;

import com.sprata.makeblog.domain.Article;
import com.sprata.makeblog.domain.ArticleRepository;
import com.sprata.makeblog.domain.ArticleRequestDto;
import com.sprata.makeblog.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// JSON으로 응답해야되니까 @RestController로 표시
@RestController
// final이 필요하면 반드시 사용할 때  => @RequiredArgsConstructor 활용
@RequiredArgsConstructor
public class ArticleController {
    
    //CRUD

    private final ArticleRepository articleRepository;
    private final ArticleService articleService;

    // 전체 게시글 목록 조회 => Get
    @GetMapping("/api/articles")
    public List<Article> totalArticles(){
        return articleRepository.findAllByOrderByModifiedAtDesc();
    }

    // 게시글 작성 => Post
    @PostMapping("/api/articles")
    public Article createArticle(@RequestBody ArticleRequestDto requestDto){
        Article article = new Article(requestDto);
        return articleRepository.save(article);
    }

    // 게시물 조회 => Get
    @GetMapping("/api/articles/{id}")
    public Article checkArticle (@PathVariable Long id){
        Article article = articleRepository.findById(id).orElseThrow(
                ()-> new NullPointerException("해당 게시물이 존재하지 않습니다.")
        );
        return article;
    }
    
    // 게시물 비밀번호 확인 => Post
    @PostMapping("/api/articles/{id}")
    public String checkPassword(@PathVariable Long id, @RequestBody ArticleRequestDto requestDto) {
        Article article = articleRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        return requestDto.getPassword();
    public boolean checkPassword(@PathVariable Long id, @RequestBody ArticleRequestDto requestDto) {
        Article article = articleService.findArticle(id);
        return article.getPassword().equals(requestDto.getPassword());
    }

    // 게시물 수정 => Put
    @PutMapping("/api/articles/{id}")
    public Long updateArticle(@PathVariable Long id, @RequestBody ArticleRequestDto requestDto){
        articleService.update(id, requestDto);
        return id;
    public String updateArticle(@PathVariable Long id, @RequestBody ArticleRequestDto requestDto){
        Article article = articleService.findArticle(id);
        if (article.getPassword().equals(requestDto.getPassword())){
            articleService.update(id, requestDto);
            return "수정 완료!";
        }
        else {
            return "비밀번호가 다릅니다. 수정할 수 없습니다.";
        }


    }

    // 게시물 삭제 => Delete
    @DeleteMapping("/api/articles/{id}")
    public void deleteArticle(@PathVariable Long id){
    public String deleteArticle(@PathVariable Long id){
        articleRepository.deleteById(id);
        return "삭제 완료!";
    }



}

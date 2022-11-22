package com.ulysseguillot.ststp02.controller;

import com.ulysseguillot.ststp02.entity.Article;
import com.ulysseguillot.ststp02.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("")
    public List<Article> articles(){
        return articleService.listArticles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> get(@PathVariable Integer id) {
        try {
            Article article = articleService.getArticle(id);
            return new ResponseEntity<Article>(article, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody Article article) {
        articleService.saveArticle(article);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Article article, @PathVariable Integer id) {
        try {
            //Article existArticle = articleService.getArticle(id);
            article.setId(id);
            articleService.saveArticle(article);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        articleService.deleteArticle(id);
    }
}

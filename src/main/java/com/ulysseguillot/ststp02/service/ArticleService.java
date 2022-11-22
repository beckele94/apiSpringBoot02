package com.ulysseguillot.ststp02.service;

import com.ulysseguillot.ststp02.entity.Article;
import com.ulysseguillot.ststp02.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> listArticles() {
        return articleRepository.findAll();
    }

    public void saveArticle (Article article) {
        articleRepository.save(article);
    }

    public  Article getArticle (Integer id){
        return articleRepository.findById(id).get();
    }

    public void deleteArticle (Integer id){
        articleRepository.deleteById(id);
    }
}

package com.ulysseguillot.ststp02.repository;

import com.ulysseguillot.ststp02.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

}

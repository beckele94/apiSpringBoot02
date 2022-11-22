package com.ulysseguillot.ststp02.controller;

import com.ulysseguillot.ststp02.entity.Article;
import com.ulysseguillot.ststp02.entity.SousCategorie;
import com.ulysseguillot.ststp02.service.ArticleService;
import com.ulysseguillot.ststp02.service.SousCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/souscategories")
public class SousCategorieController {
    @Autowired
    SousCategorieService sousCategorieService;

    @GetMapping("")
    public List<SousCategorie> sousCategories(){
        return sousCategorieService.listSousCategorie();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SousCategorie> get(@PathVariable Integer id) {
        try {
            SousCategorie sousCategorie = sousCategorieService.getSousCategorie(id);
            return new ResponseEntity<SousCategorie>(sousCategorie, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<SousCategorie>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public void add(@RequestBody SousCategorie sousCategorie) {
        sousCategorieService.saveSousCategorie(sousCategorie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody SousCategorie sousCategorie, @PathVariable Integer id) {
        try {
            //Article existArticle = articleService.getArticle(id);
            sousCategorie.setId(id);
            sousCategorieService.saveSousCategorie(sousCategorie);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        sousCategorieService.deleteSousCategorie(id);
    }
}

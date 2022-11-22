package com.ulysseguillot.ststp02.service;

import com.ulysseguillot.ststp02.entity.Article;
import com.ulysseguillot.ststp02.entity.Categorie;
import com.ulysseguillot.ststp02.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> listCategories(){
        return categorieRepository.findAll();
    }

    public void saveCategorie (Categorie categorie) {
        categorieRepository.save(categorie);
    }

    public  Categorie getCategorie (Integer id){
        return categorieRepository.findById(id).get();
    }

    public void deleteCategorie (Integer id){
        categorieRepository.deleteById(id);
    }
}

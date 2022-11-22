package com.ulysseguillot.ststp02.service;

import com.ulysseguillot.ststp02.entity.SousCategorie;
import com.ulysseguillot.ststp02.repository.SousCategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class SousCategorieService {
    @Autowired
    private SousCategorieRepository sousCategorieRepository;

    public List<SousCategorie> listSousCategorie() {
        return sousCategorieRepository.findAll();
    }

    public void saveSousCategorie (SousCategorie sousCategorie) {
        sousCategorieRepository.save(sousCategorie);
    }

    public  SousCategorie getSousCategorie (Integer id){
        return sousCategorieRepository.findById(id).get();
    }

    public void deleteSousCategorie (Integer id){
        sousCategorieRepository.deleteById(id);
    }
}

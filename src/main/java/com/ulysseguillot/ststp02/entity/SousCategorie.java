package com.ulysseguillot.ststp02.entity;

import javax.persistence.*;

@Entity
@Table(name = "souscategories")
public class SousCategorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    //@ManyToOne
    //@JoinColumn
    private int idCategorie;

    public SousCategorie() {

    }

    public SousCategorie(String nom, int idCategorie) {
        this.nom = nom;
        this.idCategorie = idCategorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }
}

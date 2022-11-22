package com.ulysseguillot.ststp02.entity;

public class SousCategorie {
    private int id;
    private String nom;
    private int idCategorie;

    public SousCategorie(int id, String nom, int idCategorie) {
        this.id = id;
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

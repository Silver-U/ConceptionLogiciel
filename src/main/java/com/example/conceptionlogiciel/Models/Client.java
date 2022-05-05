package com.example.conceptionlogiciel.Models;

import java.util.ArrayList;
import java.util.List;

public class Client
{
    private String nom;
    private String prenom;
    private String adresse;
    private String numeroPermis;
    private int age;
    private String numeroTel;
    private List<Accompagneur> accompagneurs;

    public Client(String nom, String prenom, String adresse, String numeroPermis, int age, String numeroTel)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numeroPermis = numeroPermis;
        this.age = age;
        this.numeroTel = numeroTel;
        accompagneurs = new ArrayList<>();
    }

    public String getNumeroTel()
    {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel)
    {
        this.numeroTel = numeroTel;
    }

    public void ajouterAccompagnateur(Accompagneur accompagneur)
    {
        accompagneurs.add(accompagneur);
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public String getNumeroPermis()
    {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis)
    {
        this.numeroPermis = numeroPermis;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public List<Accompagneur> getAccompagneurs()
    {
        return accompagneurs;
    }
}

package com.example.conceptionlogiciel.Models;

public class Employee
{
    private String nom;
    private String prenom;
    private String adresse;
    private String numero;
    private final String codeEmploye;

    public Employee(String nom, String prenom, String adresse, String numero, String codeEmploye)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numero = numero;
        this.codeEmploye = codeEmploye;
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

    public String getNumero()
    {
        return numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public String getCodeEmploye()
    {
        return codeEmploye;
    }
}

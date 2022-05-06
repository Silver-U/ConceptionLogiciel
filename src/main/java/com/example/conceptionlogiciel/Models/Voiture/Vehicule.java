package com.example.conceptionlogiciel.Models.Voiture;

public class Vehicule
{
    private String marque;
    private String numeroImmatriculation;
    private int annee;
    private Type type;
    private boolean pourClientEnregistrer;
    private int killometrage;
    private int nombreDePlace;

    private boolean EnLocationReservation;
    private float tailleReservoir;
    private String couleur;
    private TypeCarburant carburant;
    private int nombrePorte;
    private int hauteur;
    private int largeur;
    private int poids;

    public Vehicule(String marque, String numeroImmatriculation, int annee, int killometrage, int nombreDePlace, boolean enLocationReservation, String couleur, TypeCarburant carburant, Type type) {
        this.marque = marque;
        this.numeroImmatriculation = numeroImmatriculation;
        this.annee = annee;
        this.killometrage = killometrage;
        this.nombreDePlace = nombreDePlace;
        EnLocationReservation = enLocationReservation;
        this.couleur = couleur;
        this.carburant = carburant;
        this.type = type;
    }

    public String getMarque()
    {
        return marque;
    }

    public void setMarque(String marque)
    {
        this.marque = marque;
    }

    public int getAnnee()
    {
        return annee;
    }

    public void setAnnee(int annee)
    {
        this.annee = annee;
    }

    public boolean isPourClientEnregistrer()
    {
        return pourClientEnregistrer;
    }

    public void setPourClientEnregistrer(boolean pourClientEnregistrer)
    {
        this.pourClientEnregistrer = pourClientEnregistrer;
    }

    public boolean isEnLocationReservation()
    {
        return EnLocationReservation;
    }

    public void setEnLocationReservation(boolean enLocationReservation)
    {
        EnLocationReservation = enLocationReservation;
    }

    public float getTailleReservoir()
    {
        return tailleReservoir;
    }

    public void setTailleReservoir(float tailleReservoir)
    {
        this.tailleReservoir = tailleReservoir;
    }

    public String getCouleur()
    {
        return couleur;
    }

    public void setCouleur(String couleur)
    {
        this.couleur = couleur;
    }

    public TypeCarburant getCarburant()
    {
        return carburant;
    }

    public void setCarburant(TypeCarburant carburant)
    {
        this.carburant = carburant;
    }

    public int getNombrePorte()
    {
        return nombrePorte;
    }

    public void setNombrePorte(int nombrePorte)
    {
        this.nombrePorte = nombrePorte;
    }

    public int getHauteur()
    {
        return hauteur;
    }

    public void setHauteur(int hauteur)
    {
        this.hauteur = hauteur;
    }

    public int getLargeur()
    {
        return largeur;
    }

    public void setLargeur(int largeur)
    {
        this.largeur = largeur;
    }

    public int getPoids()
    {
        return poids;
    }

    public void setPoids(int poids)
    {
        this.poids = poids;
    }

    public int getKillometrage()
    {
        return killometrage;
    }

    public void setKillometrage(int killometrage)
    {
        this.killometrage = killometrage;
    }

    public int getNombreDePlace()
    {
        return nombreDePlace;
    }

    public void setNombreDePlace(int nombreDePlace)
    {
        this.nombreDePlace = nombreDePlace;
    }


    public String getNumeroImmatriculation()
    {
        return numeroImmatriculation;
    }

    public void setNumeroImmatriculation(String numeroImmatriculation)
    {
        this.numeroImmatriculation = numeroImmatriculation;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "Marque='" + marque + '\'' +
                ", NumeroImmatriculation='" + numeroImmatriculation + '\'' +
                ", Annee=" + annee +
                ", PourClientEnregistrer=" + pourClientEnregistrer +
                ", killometrage=" + killometrage +
                ", nombreDePlace=" + nombreDePlace +
                ", En Location/Reservation :" + EnLocationReservation +
                ", TailleReservoir :" + tailleReservoir +
                ", Couleur='" + couleur + '\'' +
                ", Carburant=" + carburant +
                ", NombrePorte=" + nombrePorte +
                ", Hauteur=" + hauteur +
                ", Largeur=" + largeur +
                ", Poids=" + poids +
                ", Type=" + type +
                '}';
    }
}

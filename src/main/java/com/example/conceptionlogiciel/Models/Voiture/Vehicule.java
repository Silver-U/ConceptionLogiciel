package com.example.conceptionlogiciel.Models.Voiture;

public class Vehicule
{
    private String marque;
    private String numeroImmatriculation;
    private int annee;
    private boolean pourClientEnregistrer;
    private int killometrage;
    private int nombreDePlace;
    private Etat etat;
    private boolean EnLocationReservation;
    private float tailleReservoir;
    private String couleur;
    private TypeCarburant carburant;
    private int nombrePorte;
    private int hauteur;
    private int largeur;
    private int poids;

    public Vehicule(String marque)
    {
        this.marque = marque;
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

    public Etat getEtat()
    {
        return etat;
    }

    public void setEtat(Etat etat)
    {
        this.etat = etat;
    }

    public String getNumeroImmatriculation()
    {
        return numeroImmatriculation;
    }

    public void setNumeroImmatriculation(String numeroImmatriculation)
    {
        this.numeroImmatriculation = numeroImmatriculation;
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
                ", etat=" + etat +
                ", En Location/Reservation :" + EnLocationReservation +
                ", TailleReservoir :" + tailleReservoir +
                ", Couleur='" + couleur + '\'' +
                ", Carburant=" + carburant +
                ", NombrePorte=" + nombrePorte +
                ", Hauteur=" + hauteur +
                ", Largeur=" + largeur +
                ", Poids=" + poids +
                '}';
    }
}

package com.example.conceptionlogiciel.Models;

import com.example.conceptionlogiciel.Models.Voiture.Vehicule;

public class Client {
    private Client client;
    private Vehicule vehicule;
    private String idResevation;
    private String dateFinResevation;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public String getIdResevation() {
        return idResevation;
    }

    public void setIdResevation(String idResevation) {
        this.idResevation = idResevation;
    }

    public String getDateFinResevation() {
        return dateFinResevation;
    }

    public void setDateFinResevation(String dateFinResevation) {
        this.dateFinResevation = dateFinResevation;
    }
}

package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Models.Voiture.Vehicule;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    private Vehicule tempVehicule;
    private static List<Vehicule> vehicules;

    public Catalogue() {
        vehicules = new ArrayList<>();
        vehicules.add(new Vehicule("sadasd"));
    }

    public void insert(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    public void delete(Vehicule vehicule) {
        vehicules.remove(vehicule);
    }

    public boolean vehiculeExiste(String numeroImmatriculation) {
        boolean isthere = false;

        for (Vehicule v : vehicules) {
            if (v.getNumeroImmatriculation().equals(numeroImmatriculation)) {
                isthere = true;
                break;
            }
        }
        return isthere;
    }

    public Vehicule getTempVehicule(String numeroImmatriculation) {
        for (Vehicule v : vehicules) {
            if (v.getNumeroImmatriculation().equals(numeroImmatriculation)) {
                return v;
            }
        }
        return null;
    }
    public static List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void onClicked(MouseEvent mouseEvent)
    {
    }

    public void onClicked2(MouseEvent mouseEvent)
    {
    }
}

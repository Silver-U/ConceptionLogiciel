package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Models.Voiture.Vehicule;
import com.example.conceptionlogiciel.Repository.VehiculeRepository;

import java.util.ArrayList;
import java.util.List;

public class Catalogue
{
    private Vehicule tempVehicule;
    private List<Vehicule> vehicules;

    public Catalogue()
    {
        vehicules = new ArrayList<>();
    }

    public void insert(Vehicule vehicule)
    {
        vehicules.add(vehicule);
    }

    public void delete(Vehicule vehicule)
    {
        vehicules.remove(vehicule);
    }

    public boolean vehiculeExiste(String numeroImmatriculation)
    {
        boolean isthere = false;

        for(Vehicule v : vehicules)
        {
            if (v.getNumeroImmatriculation().equals(numeroImmatriculation))
            {
                isthere = true;
                break;
            }
        }
        return isthere;
    }

    public Vehicule getTempVehicule(String numeroImmatriculation)
    {
        for(Vehicule v : vehicules)
        {
            if (v.getNumeroImmatriculation().equals(numeroImmatriculation))
            {
                return v;
            }
        }
        return null;
    }
}

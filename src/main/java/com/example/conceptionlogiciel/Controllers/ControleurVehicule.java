package com.example.conceptionlogiciel.Controllers;

import com.example.conceptionlogiciel.Models.Voiture.Vehicule;
import com.example.conceptionlogiciel.Repository.VehiculeRepository;

import java.util.List;

public class ControleurVehicule
{
    private Vehicule tempVehicule;
    private List<Vehicule> vehicules;
    private VehiculeRepository repo;

    public ControleurVehicule()
    {
        repo = new VehiculeRepository();
    }

    public void createVehicule()
    {

    }

    public void insert(Vehicule vehicule)
    {
        repo.insert(vehicule);
    }

    public boolean supprimerVehicule(Vehicule vehicule)
    {
        if (vehiculeSupprimable())
        {
            repo.delete(vehicule);
            return true;
        }
        return false;
    }

    public boolean vehiculeSupprimable()
    {
        return tempVehicule.isEnLocationReservation();
    }

    public void getVehicule(String numeroImmatriculation)
    {
        repo.getVehicule(numeroImmatriculation);
    }

    public Vehicule getTempVehicule()
    {
        return tempVehicule;
    }

    public void setTempVehicule(Vehicule tempVehicule)
    {
        this.tempVehicule = tempVehicule;
    }

    public List<Vehicule> getVoitures()
    {
        return vehicules;
    }

    public void setVoitures(List<Vehicule> vehicules)
    {
        this.vehicules = vehicules;
    }

    public VehiculeRepository getRepo()
    {
        return repo;
    }

    public void setRepo(VehiculeRepository repo)
    {
        this.repo = repo;
    }
}

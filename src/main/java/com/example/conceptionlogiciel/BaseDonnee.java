package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Models.Client;
import com.example.conceptionlogiciel.Models.Voiture.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class BaseDonnee
{
    static BaseDonnee instance;
    private List<Client> clients;

    private BaseDonnee()
    {
        this.clients = new ArrayList<>();
    }

    public static BaseDonnee getInstance()
    {
        if (instance == null)
        {
            instance = new BaseDonnee();
        }

        return instance;
    }

    public List<Client> getClients()
    {
        return clients;
    }
}

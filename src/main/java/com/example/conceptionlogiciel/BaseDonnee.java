package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Models.Client;
import com.example.conceptionlogiciel.Models.Reservation;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.List;

public class BaseDonnee
{
    static BaseDonnee instance;
    private List<Reservation> reservations;
    private List<Location> locations;
    private List<Client> clients;


    private BaseDonnee()
    {
        this.clients = new ArrayList<>();
        reservations = new ArrayList<>();
        locations = new ArrayList<>();
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

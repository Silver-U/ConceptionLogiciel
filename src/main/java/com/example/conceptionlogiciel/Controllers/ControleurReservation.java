package com.example.conceptionlogiciel.Controllers;

import com.example.conceptionlogiciel.Models.Reservation;
import com.example.conceptionlogiciel.Repository.ReservationRepository;

import java.util.List;

public class ControleurReservation {


    private Reservation reservation;
    private List<Reservation> reservations;
    private ReservationRepository repo;

    public ControleurReservation()
    {
        repo = new ReservationRepository();
    }


    public void insert(Reservation reservation)
    {
        repo.insert(reservation);
    }

}

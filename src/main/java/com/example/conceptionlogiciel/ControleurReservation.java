package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Models.Reservation;
import com.example.conceptionlogiciel.Repository.ReservationRepository;

import java.util.List;

public class ControleurReservation {


    private Reservation reservation;
    private List<Reservation> reservations;
    private final ReservationRepository repo;

    public ControleurReservation()
    {
        repo = new ReservationRepository();
    }


    public void insert(Reservation reservation)
    {
        repo.insert(reservation);
    }

}

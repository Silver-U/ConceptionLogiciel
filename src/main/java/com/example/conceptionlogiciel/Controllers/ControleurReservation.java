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

    public void createReservation()
    {

    }

    public void insert(Reservation reservation)
    {
        repo.insert(reservation);
    }

    public boolean supprimerReservation(Reservation reservation)
    {
        if (reservationSupprimable())
        {
            repo.delete(reservation);
            return true;
        }
        return false;
    }

    public boolean reservationSupprimable()
    {
        return reservation.isEnLocationReservation();
    }

    public void getReservation(String numeroImmatriculation)
    {
        repo.getReservation(numeroImmatriculation);
    }

    public Reservation getReservation() {return reservation;}

    public void setReservation(Reservation reservation) {this.reservation = reservation;}
    public List<Reservation> getReservations()
    {
        return reservations;
    }


    public void setReservations(List<Reservation> reservations)
    {
        this.reservations = reservations;
    }

    public ReservationRepository getRepo()
    {
        return repo;
    }

    public void setRepo(ReservationRepository repo)
    {
        this.repo = repo;
    }
}

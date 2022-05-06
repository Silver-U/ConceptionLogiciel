package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Models.Voiture.Etat;
import com.example.conceptionlogiciel.Models.Voiture.TypeCarburant;
import com.example.conceptionlogiciel.Models.Voiture.Vehicule;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class HelloController
{
    @FXML
    private Label welcomeText;

    @FXML
    private TableView table;

    @FXML
    private Scene scene;
    private Node node;
    private Stage stage;

    private Catalogue catalogue;
    @FXML
    private TableColumn marque, immatriculation, couleur, année, kilometrage, carburant, places, etat, location_reservation;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    protected void loadCatalogue(){


        marque.setCellValueFactory( new PropertyValueFactory<Vehicule,String>("marque"));
        immatriculation.setCellValueFactory( new PropertyValueFactory<Vehicule,String>("numeroImmatriculation"));
        année.setCellValueFactory( new PropertyValueFactory<Vehicule,Integer>("annee"));
        carburant.setCellValueFactory( new PropertyValueFactory<Vehicule, TypeCarburant>("carburant"));
        couleur.setCellValueFactory( new PropertyValueFactory<Vehicule,String>("couleur"));
        kilometrage.setCellValueFactory( new PropertyValueFactory<Vehicule,Integer>("killometrage"));
        places.setCellValueFactory( new PropertyValueFactory<Vehicule,Integer>("nombreDePlace"));
        location_reservation.setCellValueFactory( new PropertyValueFactory<Vehicule,Boolean>("EnLocationReservation"));
        etat.setCellValueFactory( new PropertyValueFactory<Vehicule, Etat>("etat"));

        table.setItems((ObservableList) catalogue.getVehicules());
    }

    public void swapTo(String url){
       // container.FXMLLoader(getClass().getResource(url));
    }
}
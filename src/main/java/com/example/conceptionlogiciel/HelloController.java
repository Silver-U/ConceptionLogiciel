package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Models.Voiture.Type;
import com.example.conceptionlogiciel.Models.Voiture.TypeCarburant;
import com.example.conceptionlogiciel.Models.Voiture.Vehicule;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController
{
    @FXML
    private Label welcomeText;
    @FXML
    private BorderPane border;
    @FXML
    private TableView table;

    @FXML
    private Scene scene;
    private Node node;
    private Stage stage;

    private Catalogue catalogue;
    @FXML
    private TableColumn marque, immatriculation, couleur, année, kilometrage, carburant, places, type, location_reservation;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    protected void loadCatalogue() throws IOException {

        swapTo("catalogue.fxml");

        marque.setCellValueFactory( new PropertyValueFactory<Vehicule,String>("marque"));
        immatriculation.setCellValueFactory( new PropertyValueFactory<Vehicule,String>("numeroImmatriculation"));
        année.setCellValueFactory( new PropertyValueFactory<Vehicule,Integer>("annee"));
        carburant.setCellValueFactory( new PropertyValueFactory<Vehicule, TypeCarburant>("carburant"));
        couleur.setCellValueFactory( new PropertyValueFactory<Vehicule,String>("couleur"));
        kilometrage.setCellValueFactory( new PropertyValueFactory<Vehicule,Integer>("killometrage"));
        places.setCellValueFactory( new PropertyValueFactory<Vehicule,Integer>("nombreDePlace"));
        location_reservation.setCellValueFactory( new PropertyValueFactory<Vehicule,Boolean>("EnLocationReservation"));
        type.setCellValueFactory( new PropertyValueFactory<Vehicule,Boolean>("type"));

        table.setItems((ObservableList) catalogue.getVehicules());
    }

    public void swapTo(String url) throws IOException {
        border.setCenter(FXMLLoader.load(Objects.requireNonNull(getClass().getResource(url))));
    }
}
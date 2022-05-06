package com.example.conceptionlogiciel;


import com.example.conceptionlogiciel.Models.Voiture.TypeCarburant;
import com.example.conceptionlogiciel.Models.Voiture.Vehicule;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
    public BorderPane content;
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
    protected void onHelloButtonClick() throws IOException
    {
        swapTo("catalogue.fxml");
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

        table.setItems((ObservableList) catalogue.getVehicules());
    }

    public void swapTo(String url) throws IOException
    {
        content.setCenter(FXMLLoader.load(Objects.requireNonNull(getClass().getResource(url))));
    }

    public void gotoGererClient(ActionEvent actionEvent) throws IOException
    {
        swapTo("");
    }

    public void gotoConsCat(ActionEvent actionEvent) throws IOException
    {
        swapTo("catalogue.fxml");
    }

    public void gotoEnrVeh(ActionEvent actionEvent) throws IOException
    {
        swapTo("emregistrerVéhicule.fxml");
    }

    public void gotoSuppVeh(ActionEvent actionEvent) throws IOException
    {
        swapTo("SuppressionVéhicule.fxml");
    }
}
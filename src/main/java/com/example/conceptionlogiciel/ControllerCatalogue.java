package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Catalogue;
import com.example.conceptionlogiciel.Models.Voiture.TypeCarburant;
import com.example.conceptionlogiciel.Models.Voiture.Vehicule;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class ControllerCatalogue {

    @FXML
    private BorderPane border;
    @FXML
    private TableView table;

    private Catalogue catalogue;
    @FXML
    private TableColumn marque, immatriculation, couleur, année, kilometrage, carburant, places, type, location_reservation;
    public ControllerCatalogue(){
    }

    public void onClicked(javafx.scene.input.MouseEvent mouse){
        System.out.println("Connexion du client...");
    }

    public void onClicked2(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Sortie...");
    }

    protected void loadCatalogue() {

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

    public void swapTo(String url) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
            Parent root = loader.load();
            border.setCenter(root);}
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

package com.example.conceptionlogiciel;

import com.example.conceptionlogiciel.Catalogue;
import com.example.conceptionlogiciel.Models.Voiture.Vehicule;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class ControllerCatalogue {


    public ControllerCatalogue(){
    }

    public void onClicked(javafx.scene.input.MouseEvent mouse){
        System.out.println("Connexion du client...");
    }

    public void onClicked2(javafx.scene.input.MouseEvent mouseEvent) {
        System.out.println("Sortie...");
    }
}

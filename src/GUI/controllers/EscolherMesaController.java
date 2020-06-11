/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import Logic.Logic;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class EscolherMesaController
{
    
    
        @FXML private ListView mesasListView;
        @FXML private Button voltarBtn;
        @FXML private Button escolherBtn;
        
    @FXML    
    public void initialize() {
        //populateMesas();
    }    
    
    //Erro com esta função!!! Falta resolver!!!!!!!
    
    public void populateMesas()
    {
        
        ObservableList<String> results = Logic.getMesasDisponiveis();
        
        mesasListView.getItems().addAll(results);
    }
    
}

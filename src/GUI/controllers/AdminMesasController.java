/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Estabelecimento;
import DAL.Mesas;
import GUI.Main;
import Logic.Logic;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class AdminMesasController{

     @FXML private ListView mesasListView;
        @FXML private Button voltarBtn;
        @FXML private Button escolherBtn;
        
        @FXML
    public void initialize()
    {
        populateListView();
        
    }
    
     public void populateListView()
    {
      
        ObservableList<Mesas> mesas = Logic.numMesas();
        List<BigInteger> numMesas = new ArrayList<>();
        List<String> list = new ArrayList<>();
        ObservableList<String> numMesasToString = null;

        
        mesas.forEach(mesa -> {
            numMesas.add(mesa.getNumMesa());
        });
        
        numMesas.forEach(numMesa -> {
            list.add(numMesa.toString());
        });
        
        numMesasToString = FXCollections.observableArrayList(list);
        
        mesasListView.getItems().addAll(numMesasToString); 
     
        
        
    }
     
     public void voltarBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/MenuAdmin.fxml");
    }
 
    
     public void adicionarBtnAction(ActionEvent event) throws Exception
    {
         Main.changeScene("/GUI/resources/AdicionarMesas.fxml");  
        
    }
    
    public void apagaBtnAction(ActionEvent event) throws Exception
    {
        Mesas mesa = new Mesas();
      
         
      
      
      String numMesa2 = mesasListView.getSelectionModel().getSelectedItem().toString();
       
      int numMesa = Integer.valueOf(numMesa2);
      
      BigInteger bigInteger = BigInteger.valueOf(numMesa);
      
        Logic.apagaMesas(bigInteger);
 
         Main.changeScene("/GUI/resources/MenuAdmin.fxml"); 
         Main.createStage("Sucesso","Mesa removida com sucesso.",350,150);
    
    }
    
    public void editaBtnAction(ActionEvent event) throws Exception
    {

    }
   
    
}

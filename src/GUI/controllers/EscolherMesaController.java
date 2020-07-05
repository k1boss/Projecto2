/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Mesas;
import GUI.Main;
import Logic.Logic;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

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
    public void initialize() 
    {
        populateMesas();
    }    
    
    //Erro com esta função!!! Falta resolver!!!!!!!
    
    public void populateMesas()
    {
        ObservableList<Mesas> mesas = Logic.getMesasDisponiveis();
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
        
        mesasListView.getItems().addAll(numMesasToString); //not printing to ListView
    }
    
    public void voltarBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/MenuCliente.fxml");
    }
    
    public void escolherMesaBtnAction() throws Exception
    {
        //TODO nao ir buscar idMesa a Label
        int idMesa = Integer.parseInt((String) mesasListView.getSelectionModel().getSelectedItem());
        Logic.escolherMesa(idMesa);
        Main.changeScene("/GUI/resources/EscolherProdutos.fxml");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import GUI.Main;
import Logic.Logic;
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
public class EscolherEstabelecimentoController{
    
    @FXML private ListView estabelecimentosList;
    @FXML private Button logoutBtn;
    @FXML private Button escolherBtn;
    
    @FXML
    public void initialize()
    {
        populateListView();
        
    }
    
    
    public void populateListView()
    {  
        ObservableList<String> results = Logic.nomesEstabelecimentos();
        
        estabelecimentosList.getItems().addAll(results);
    }
    
    public void logoutBtnAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/Login.fxml");
    }
    
    public void escolherBtnAction(ActionEvent event) throws Exception
    {
        //Seleccionar Estabelecimento
        String nome = estabelecimentosList.getSelectionModel().getSelectedItem().toString();
        Logic.escolherEstabelecimento(nome);
        
        //Mudar Scene
        Main.changeScene("/GUI/resources/EscolherMesa.fxml");
    }
 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Estabelecimento;
import GUI.Main;
import Logic.Logic;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 *
 * @author Carlos
 */
public class AdminEstabelecimentosController {
     @FXML private ListView estabelecimentosList;
    @FXML private Button logoutBtn;
    @FXML private Button escolherBtn;
    @FXML private Button apagaBtn;
    @FXML private Button editaBtn;
    
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
    
    public void voltarBtnAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/MenuAdmin.fxml");
    }
    
    public void adicionarBtnAction(ActionEvent event) throws Exception
    {
         Main.changeScene("/GUI/resources/AdicionarEstabelecimento.fxml");  
        
    }
    
    public void apagaBtnAction(ActionEvent event) throws Exception
    {
        
      Estabelecimento estabelecimento = new Estabelecimento();
      
       String nome = estabelecimentosList.getSelectionModel().getSelectedItem().toString();
       
        Logic.apagaEstabelecimento(nome);
 
         Main.changeScene("/GUI/resources/MenuAdmin.fxml"); 
         Main.createStage("Sucesso","Estabelecimento Removido com sucesso.",350,150);
    }
    
    public void editaBtnAction(ActionEvent event) throws Exception
    {
        
         String nome = estabelecimentosList.getSelectionModel().getSelectedItem().toString();
       
         Logic.escolherEstabelecimento(nome);
         
  
         Main.changeScene("/GUI/resources/EditarEstabelecimento.fxml"); 
       
    }
 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import GUI.Main;
import Logic.Logic;
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
        mesasListView.getItems().addAll(Logic.getMesasDisponiveis());
        //Logic.printStuff();
    }
    
    public void voltarBtnAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/MenuCliente.fxml");
    }
    
    public void escolherMesaBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/EscolherProdutos.fxml");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package GUI.controllers;

import GUI.Main;
import Logic.Logic;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Carlos
 */
public class MenuAdminController {
     @FXML private Button estabelecimentoBtn;
    @FXML private Button mesaBtn;
    @FXML private Button produtosBtn;
   
    @FXML private Button editarPerfilBtn;
    @FXML private Button logoutBtn;
    @FXML private Label usernameLabel;
    
    
    
    @FXML
    public void initialize() 
    {
        usernameLabel.setText("Bem-Vindo: " + Logic.getUsername() + "!");
        
  
        
    }    
    
    
    public void adminestabelecimentoBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/AdminEstabelecimentos.fxml");
    }
    
    public void adminmesaBtnAction() throws Exception
    {
//        Logic.updateMesaToLivre(Logic.getSelectedMesa().getIdMesa().intValue());
        Main.changeScene("/GUI/resources/AdminMesas.fxml");
    }
    
    public void adminprodutosBtnAction() throws Exception
    {
        
        Main.changeScene("/GUI/resources/EscolherProdutos.fxml");
    
    }
    
   

    public void adminlogoutBtnAction() throws Exception
    {
        Logic.logout();
        Main.changeScene("/GUI/resources/Login.fxml");
    }
    
    
    

}

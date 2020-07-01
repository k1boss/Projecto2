/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import GUI.Main;
import Logic.Logic;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class MenuClienteController
{

    /**
     * Initializes the controller class.
     */
    
    @FXML private Button escolherEstabelecimentoBtn;
    @FXML private Button escolherMesaBtn;
    @FXML private Button escolherProdutosBtn;
    @FXML private Button checkoutBtn;
    @FXML private Button editarPerfilBtn;
    @FXML private Button logoutBtn;
    @FXML private Label usernameLabel;
    
    
    
    @FXML
    public void initialize() 
    {
        usernameLabel.setText("Bem-Vindo: " + Logic.getUsername() + "!");
        
        if(Logic.getSelectEstabelecimento()==null)
            escolherProdutosBtn.setDisable(true);
        
    }    
    
    
    public void escolherEstabelecimentoBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/EscolherEstabelecimento.fxml");
    }
    
    public void escolherMesaBtnAction() throws Exception
    {
        Logic.updateMesaToLivre(Logic.getSelectedMesa().getIdMesa().intValue());
        Main.changeScene("/GUI/resources/EscolherMesa.fxml");
    }
    
    public void escolherProdutosBtnAction() throws Exception
    {
        
        Main.changeScene("/GUI/resources/EscolherProdutos.fxml");
    
    }
    
    public void editarPerfilBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/MenuEditarPerfil.fxml");
    }
    
    public void checkoutBtnAction()
    {
        
    }
    
    public void logoutBtnAction() throws Exception
    {
        Logic.logout();
        Main.changeScene("/GUI/resources/Login.fxml");
    }
    
    
    
}

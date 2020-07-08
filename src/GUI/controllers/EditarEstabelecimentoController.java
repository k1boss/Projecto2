/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Estabelecimento;
import GUI.Main;
import Logic.Logic;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class EditarEstabelecimentoController implements Initializable {
    
   @FXML private TextField nomeField;
    @FXML private TextField ruaField;
    @FXML private TextField numPortaField;
    @FXML private TextField codpostalField;
    @FXML private TextField desccodField;
    @FXML private Label registarFailedLabel;
         
    
   public void editarBtnAction() throws Exception
    {
        
       Estabelecimento estabelecimento = new Estabelecimento();
       
            estabelecimento.setNome(nomeField.getText());
            estabelecimento.setNome(ruaField.getText());
            estabelecimento.setNome(numPortaField.getText());
            estabelecimento.setNome(codpostalField.getText());
            estabelecimento.setNome(desccodField.getText());
            
            String newNome = nomeField.getText();
            String newRua = ruaField.getText();
            String newNumPorta = numPortaField.getText();
            String newCodPostal = codpostalField.getText();
            String newDescCodPostal = desccodField.getText();
            
            Logic.editaEstabelecimento(newNome, newRua, newNumPorta, newCodPostal,newDescCodPostal );
         
             Logic.setSelectedEstabAll(newNome, newRua, newNumPorta, newCodPostal,newDescCodPostal );
        
            

        Main.changeScene("/GUI/resources/AdminEstabelecimentos.fxml");
        
    }
    
        public void voltarBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/MenuAdmin.fxml");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

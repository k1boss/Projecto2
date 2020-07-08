/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Cliente;
import DAL.Estabelecimento;
import GUI.Main;
import Logic.Logic;
import java.math.BigInteger;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class AdicionarEstabelecimentoController implements Initializable {

    @FXML private TextField nomeField;
    @FXML private TextField ruaField;
    @FXML private TextField numPortaField;
    @FXML private TextField codpostalField;
    @FXML private TextField desccodField;
    @FXML private Label registarFailedLabel;
    
    public void adicionarBtnAction() throws Exception
    {
        //Fazer o registo
        if(!Logic.estabExists(numPortaField.getText()))
        {

            Estabelecimento estabelecimento = new Estabelecimento();


            estabelecimento.setNome(nomeField.getText());
            estabelecimento.setRua(ruaField.getText());
            estabelecimento.setNumPorta(numPortaField.getText());
            estabelecimento.setCodPostal(codpostalField.getText());
            estabelecimento.setDescCodPostal(desccodField.getText());
            
           
            Logic.insertEstabelecimento(estabelecimento);
            
            //mudar a scene
            Main.changeScene("/GUI/resources/AdminEstabelecimentos.fxml");
            
            //criar stage de sucesso
            Main.createStage("Sucesso","Estabelecimento criado com sucesso.",350,150);
       }
        else
        {
            registarFailedLabel.setText("Estabelecimento ja existe.");
           registarFailedLabel.setVisible(true);
        }
        
        
        
            
    }
    
        public void voltarBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/MenuAdmin.fxml");
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

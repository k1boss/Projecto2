/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Cliente;
import GUI.Main;
import javafx.event.ActionEvent;
import Logic.Logic;
import java.math.BigInteger;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class RegistarController 
{
    @FXML private TextField usernameField;
    @FXML private TextField passwordField;
    @FXML private TextField emailField;
    @FXML private TextField nifField;
    @FXML private TextField nomeField;
    @FXML private Label registarFailedLabel;
    
            
    public void voltarButtonAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/Login.fxml");
    }
    
    public void registarButtonAction(ActionEvent event) throws Exception
    {
        //Fazer o registo
        BigInteger nif;
        if(!Logic.userExists(usernameField.getText()))
        {
            nif = BigInteger.valueOf(Integer.parseInt(nifField.getText()));
        
            Cliente cliente = new Cliente();


            cliente.setNome(nomeField.getText());
            cliente.setUsername(usernameField.getText());
            cliente.setEmail(emailField.getText());
            cliente.setNif(nif);
            cliente.setPasswd(passwordField.getText());
            
            
            Logic.insertCliente(cliente);
            
            //mudar a scene
            Main.changeScene("/GUI/resources/Login.fxml");
            
            //criar stage de sucesso
            Main.createStage("Sucesso","Registo efectuado com sucesso.",350,150);
        }
        else
        {
            registarFailedLabel.setText("Username ja existe.");
            registarFailedLabel.setVisible(true);
        }
        
        
    }
}

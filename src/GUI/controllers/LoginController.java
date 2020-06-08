/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import GUI.Main;
import javafx.event.ActionEvent;
import Logic.Logic;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class LoginController 
{
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    

    
    
    public void registarButtonAction(ActionEvent event) throws Exception
    {
        //Mudar scene
        Main.changeScene("/GUI/resources/Registar.fxml");
    }
    
    public void loginButtonAction(ActionEvent event) throws Exception
    {
        //Verificar o login
        
        Logic.login(usernameField.getText(),passwordField.getText());
        
        //Mudar scene
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import GUI.Main;
import Logic.Logic;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class MudarPasswordController {

    
    @FXML private Label passwordLabel;
    @FXML private Label confirmPasswordLabel;
    @FXML private Label warningLabel;
    @FXML private TextField passwordTextField;
    @FXML private TextField confirmPasswordTextField;
    
    /**
     * Initializes the controller class.
     */
    
    public void confirmarBtnAction() throws Exception
    {
        passwordLabel.setVisible(false);
        confirmPasswordLabel.setVisible(false);
        warningLabel.setVisible(false);
        
        
        if(passwordTextField.getText() == null || passwordTextField.getText().isEmpty())
        {
            System.out.println("5");
            passwordLabel.setText("Verifique a Password.");
            passwordLabel.setVisible(true);
            
        }
        if(confirmPasswordTextField.getText() == null || confirmPasswordTextField.getText().isEmpty())
        {
            System.out.println("6");
            confirmPasswordLabel.setText("Confirme a Password.");
            confirmPasswordLabel.setVisible(true);
        }
        else
        {
            String newPassword = confirmPasswordTextField.getText();
            if(Logic.compareStrings(passwordTextField.getText(),
                    confirmPasswordTextField.getText()))
            {
                System.out.println("4");
                Logic.updatePasswordCliente(newPassword);
                Logic.setLoggedClienteNome(newPassword);
                
                Main.createStage("Sucesso", "Password alterada com sucesso.",350,150);
                Main.changeScene("/GUI/resources/MenuEditarPerfil.fxml");
            }
            else
            {
                warningLabel.setText("Confirme se os campos estão iguais.");
                warningLabel.setVisible(true);
            }
            
        }
            
    }
    
    public void voltarBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/MenuEditarPerfil.fxml");
    }
}
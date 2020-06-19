/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Cliente;
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
public class MudarUsernameController
{

    /**
     * Initializes the controller class.
     */
    @FXML private TextField usernameTextField;
    @FXML private TextField confirmUsernameTextField;
    @FXML private Label usernameLabel;
    @FXML private Label confirmUsernameLabel;
    @FXML private Label warningLabel;
    
    public void confirmarBtnAction()
    {
        usernameLabel.setVisible(false);
        confirmUsernameLabel.setVisible(false);
        warningLabel.setVisible(false);
        
        
        if(usernameTextField.getText() == null || usernameTextField.getText().isEmpty())
        {
            System.out.println("5");
            usernameLabel.setText("Verifique o username.");
            usernameLabel.setVisible(true);
            
        }
        if(confirmUsernameTextField.getText() == null || confirmUsernameTextField.getText().isEmpty())
        {
            System.out.println("6");
            confirmUsernameLabel.setText("Confirme o Username.");
            confirmUsernameLabel.setVisible(true);
        }
        else
        {
            String newUsername = confirmUsernameTextField.getText();
            if(Logic.compareStrings(usernameTextField.getText(),
                    confirmUsernameTextField.getText()))
            {
                System.out.println("4");
                Logic.updateUsernameCliente(newUsername);
                Logic.setLoggedClienteUsername(newUsername);
                
                Cliente testCli = Logic.getLoggedCliente();
                System.out.println(testCli.getUsername());
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

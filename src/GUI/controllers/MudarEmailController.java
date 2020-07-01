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
public class MudarEmailController{
    
    @FXML private TextField emailTextField;
    @FXML private TextField confirmEmailTextField;
    @FXML private Label emailLabel;
    @FXML private Label confirmEmailLabel;
    @FXML private Label warningLabel;
    
    public void confirmarBtnAction() throws Exception
    {
        emailLabel.setVisible(false);
        confirmEmailLabel.setVisible(false);
        warningLabel.setVisible(false);
        
        
        if(emailTextField.getText() == null || emailTextField.getText().isEmpty())
        {
            System.out.println("5");
            emailLabel.setText("Verifique o Nome.");
            emailLabel.setVisible(true);
            
        }
        if(confirmEmailTextField.getText() == null || confirmEmailTextField.getText().isEmpty())
        {
            System.out.println("6");
            confirmEmailLabel.setText("Confirme o Nome.");
            confirmEmailLabel.setVisible(true);
        }
        else
        {
            String newEmail = confirmEmailTextField.getText();
            if(Logic.compareStrings(emailTextField.getText(),
                    confirmEmailTextField.getText()))
            {
                System.out.println("4");
                Logic.updateEmailCliente(newEmail);
                Logic.setLoggedClienteEmail(newEmail);
                
                Main.createStage("Sucesso", "Email alterado com sucesso.",350,150);
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

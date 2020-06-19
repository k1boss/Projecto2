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
public class MudarNomeController
{
    @FXML private TextField nomeTextField;
    @FXML private TextField confirmNomeTextField;
    @FXML private Label nomeLabel;
    @FXML private Label confirmNomeLabel;
    @FXML private Label warningLabel;
    
    public void confirmarBtnAction()
    {
        nomeLabel.setVisible(false);
        confirmNomeLabel.setVisible(false);
        warningLabel.setVisible(false);
        
        
        if(nomeTextField.getText() == null || nomeTextField.getText().isEmpty())
        {
            System.out.println("5");
            nomeLabel.setText("Verifique o Nome.");
            nomeLabel.setVisible(true);
            
        }
        if(confirmNomeTextField.getText() == null || confirmNomeTextField.getText().isEmpty())
        {
            System.out.println("6");
            confirmNomeLabel.setText("Confirme o Nome.");
            confirmNomeLabel.setVisible(true);
        }
        else
        {
            String newNome = confirmNomeTextField.getText();
            if(Logic.compareStrings(nomeTextField.getText(),
                    confirmNomeTextField.getText()))
            {
                System.out.println("4");
                Logic.updateNomeCliente(newNome);
                Logic.setLoggedClienteNome(newNome);
                
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

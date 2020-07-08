/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers.admin;

import DAL.Cliente;
import GUI.Main;
import Logic.Logic;
import java.math.BigInteger;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class InserirUtilizadorController {
    
    @FXML private TextField nomeTextField;
    @FXML private TextField usernameTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField nifTextField;
    @FXML private TextField passwordTextField;
    @FXML private CheckBox criarAdministradorCheckBox;
    
    public void registarButtonAction() throws Exception {
       /*
        Check if valid inputs
        Create object
        Check if admin
        insert to database
        */
       String nome = nomeTextField.getText();
       String username = nomeTextField.getText();
       String email = emailTextField.getText();
       String nif = nifTextField.getText();
       String password = passwordTextField.getText();
       
       if (! (allNotNull(nome, username, email, nif, password)
              && allNotEmpty(nome, username, email, nif, password))) {
           
       }
       
       Cliente cliente = new Cliente();
       cliente.setNome(nome);
       cliente.setUsername(username);
       cliente.setEmail(email);
       BigInteger int_nif = BigInteger.valueOf(Integer.parseInt(nif));
       cliente.setNif(int_nif);
       cliente.setPasswd(password);       
       
       if (criarAdministradorCheckBox.isSelected()) {
           short is_admin = 1;
           cliente.setIsAdmin(is_admin);
       }
       Logic.insertCliente(cliente);
    }
    
    public void voltarButtonAction() throws Exception {
        Main.changeScene("/GUI/resources/admin/MenuEditarUtilizadores.fxml");
    }
    
    private boolean allNotNull(Object... args) {
        for (Object arg : args) {
            if (arg == null) {
                return false;
            }
        }
        return true;
    }
    
    private boolean allNotEmpty(String... args) {
        for (String arg : args) {
            if (arg.trim().isEmpty())
                return false;
        }
        return true;
    }
}

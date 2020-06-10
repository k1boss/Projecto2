/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class LoginSuccessController
{ 
    @FXML Button fecharBtn;
    
    public void fecharBtnAction(ActionEvent event)
    {
        Stage stage = (Stage) fecharBtn.getScene().getWindow();
        stage.close();
    }
}

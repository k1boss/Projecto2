/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import Logic.Logic;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


/**
 *
 * @author Carlos
 */
public class CheckOutController {
    
    @FXML private Label referenciaLabel;
    
    @FXML
    public void initialize()
    {
        int referenciaMB = Logic.getReferenciaMB();
        String referencia = Integer.toString(referenciaMB);
        
        referenciaLabel.setText(referencia);
    }
    
}

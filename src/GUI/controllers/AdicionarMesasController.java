/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Estabelecimento;
import DAL.Mesas;
import GUI.Main;
import Logic.Logic;
import java.math.BigDecimal;
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
public class AdicionarMesasController implements Initializable {

    @FXML private TextField numMesaField;
    @FXML private TextField idEstabelecimentoField;
    @FXML private TextField estadoField;

    @FXML private Label registarFailedLabel;
    
    public void adicionarBtnAction() throws Exception
    {
        
        BigInteger numMesa;
        BigInteger estado;
        
       
        //Fazer o registo
        if(!Logic.estabExists(numMesaField.getText()))
        {

            numMesa = BigInteger.valueOf(Integer.parseInt(numMesaField.getText()));
            
            BigDecimal idEstabelecimento = new BigDecimal(idEstabelecimentoField.getText());
            estado = BigInteger.valueOf(Integer.parseInt(estadoField.getText()));
            
            Estabelecimento estab = Logic.getEstabelecimentoByID(idEstabelecimento);
            
            
            
            
            
            Mesas mesa = new Mesas();
            
            mesa.setNumMesa(numMesa);
            mesa.setIdEstabelecimento(estab);
            mesa.setEstado(estado);

            
           
            Logic.insertMesa(mesa);
            
            //mudar a scene
            Main.changeScene("/GUI/resources/AdminMesas.fxml");
            
            //criar stage de sucesso
            Main.createStage("Sucesso","Mesa criada com sucesso.",350,150);
       }
        else
        {
            registarFailedLabel.setText("Estabelecimento ja existe.");
           registarFailedLabel.setVisible(true);
        }
        
        
        
            
    }
    
        public void voltarBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/AdminMesas.fxml");
    }
        
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

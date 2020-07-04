/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers.admin;

import GUI.Main;
import Logic.Logic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author filip
 */
public class InserirProdutoController {
    
    @FXML private TextField idEstabelecimentoTextField;
    @FXML private TextField nomeTextField;
    @FXML private TextField precoTextField;
    @FXML private TextField descricaoTextField;
    
    public void inserirProdutoButtonAction(ActionEvent event) throws Exception
    {
        // TODO esclarecer com o carlos os checks e error handling aqui
        // TODO apos inserir o produto, voltar para o menu anterior ou só clear dos fields?
        System.out.println(idEstabelecimentoTextField.getText());
        int id_establecimento = Integer.parseInt(idEstabelecimentoTextField.getText());
        float preco = Float.parseFloat(precoTextField.getText());
        
        Logic.insertProduto(id_establecimento,
                            nomeTextField.getText(),
                            preco,
                            descricaoTextField.getText());
    }
    
    public void voltarButtonAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/admin/MenuAdmin.fxml");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers.admin;

import DAL.Produto;
import GUI.Main;
import Logic.Logic;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class EditarProdutoController{

    @FXML private Text nomeAtualText;
    @FXML private Text precoAtualText;
    @FXML private Text descricaoAtualText;
    @FXML private TextField nomeTextField;
    @FXML private TextField precoTextField;
    @FXML private TextField descricaoTextField;
    
    @FXML
    public void initialize() {
        Produto produto = Logic.getSelectedProduto();
        nomeAtualText.setText(produto.getNome());
        precoAtualText.setText(String.valueOf(produto.getPreco()));
        descricaoAtualText.setText(produto.getDescricao());
    }    
    
    public void voltarButtonAction() throws Exception {
        Main.changeScene("/GUI/resources/admin/MenuAdmin.fxml");
    }
    
    public void confirmarButtonAction() throws Exception {
        Produto produto = Logic.getSelectedProduto();
        
        if (nomeTextField != null && (! nomeTextField.getText().trim().isEmpty())) {
            produto.setNome(nomeTextField.getText().trim());
        }
        if (precoTextField != null && (! precoTextField.getText().trim().isEmpty())) {
            double aux = Double.valueOf(precoTextField.getText().trim());
            produto.setPreco(aux);
        }
        if (descricaoTextField != null && (! descricaoTextField.getText().trim().isEmpty())) {
            produto.setDescricao(descricaoTextField.getText().trim());
        }
        
        Logic.updateProduto(produto);
        initialize();
    }
    
    public void removerButtonAction() throws Exception {
        Produto produto = Logic.getSelectedProduto();
        Logic.removeProduto(produto);
        Main.changeScene("/GUI/resources/admin/MenuAdmin.fxml");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers.admin;

import GUI.Main;
import Logic.Logic;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 *
 * @author filip
 */
public class EscolherProdutoController
{
    @FXML private ListView produtosList;
    @FXML private Button escolherBtn;
    
    @FXML
    public void initialize()
    {
        populateListView();
    }
    
    public void populateListView()
    {
        ObservableList<String> nomes_produtos = Logic.fetchProdutosFromEstabelecimento();
        produtosList.getItems().addAll(nomes_produtos);
    }
    
    public void voltarBtnAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/admin/MenuAdmin.fxml");
    }
    
    public void escolherBtnAction() throws Exception {
        
    }
}

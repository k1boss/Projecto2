/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers.admin;

import DAL.Produto;
import GUI.Main;
import Logic.Logic;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    List<Produto> produtos;
    
    @FXML
    public void initialize()
    {
        populateListView();
    }
    
    public void populateListView()
    {
        this.produtos = Logic.fetchProdutosFromEstabelecimento();
        List<String> produto_mais_id = new ArrayList();
        for(Produto produto : this.produtos) {
            produto_mais_id.add(produto.getNome() + "    " + produto.getIdProduto());
        }
        
        produtosList.getItems().addAll(produto_mais_id);
    }
    
    public void voltarBtnAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/admin/MenuAdmin.fxml");
    }
    
    public void escolherBtnAction() throws Exception {
        String nome_mais_id = produtosList.getSelectionModel().getSelectedItem().toString();
        Pattern id_pattern = Pattern.compile(".*\\s{4}([\\d]+)");
        Matcher m = id_pattern.matcher(nome_mais_id);
        m.find();
        String str_id = m.group(1);
        
        DecimalFormat dm = new DecimalFormat();
        dm.setParseBigDecimal(true);
        BigDecimal id = (BigDecimal) dm.parse(str_id);
        
        for (Produto produto : produtos) {
            if(produto.getIdProduto().equals(id)) {
                Logic.setSelectedProduto(produto);
                break;
            }
        }
        
        Main.changeScene("/GUI/resources/admin/EditarProduto.fxml");
    }
}

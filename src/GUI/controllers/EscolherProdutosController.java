/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import DAL.Produto;
import Logic.Logic;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class EscolherProdutosController 
{
    @FXML private VBox nomesVBox;
    @FXML private VBox precoVBox;
    @FXML private VBox qtdsVBox;
    @FXML private Button escolherBtn;
    
    private static ArrayList<Label> quantidades = new ArrayList<>();
    private static ArrayList<BigDecimal> idProdutos = new ArrayList<>();
    
    @FXML
    public void initialize() 
    {
        populateFlowPane();
    }   
    
    public void populateFlowPane()
    {
        ObservableList<Produto> produtos = Logic.getProdutos();
        
        produtos.forEach(prod -> {
            HBox hbox = new HBox(5);
            
            Label nome = new Label(prod.getNome());
            Label preco = new Label(String.valueOf(prod.getPreco()));
            Button minus = new Button("-");
            minus.setMinSize(20, 20);
            Label qtd = new Label("0");
            Button plus = new Button("+");
            
            nomesVBox.getChildren().add(nome);
            precoVBox.getChildren().add(preco);
            
            hbox.getChildren().addAll(minus, qtd, plus);
            
            qtdsVBox.getChildren().add(hbox);
            
            //remover unidades do produto
            minus.setOnAction((ActionEvent e) -> {
                int quantidade = Integer.parseInt(qtd.getText());
                if(quantidade >= 1)
                {
                    quantidade--;
                    qtd.setText(String.valueOf(quantidade));
                }
            });
            
            //adicionar unidades do produto
            plus.setOnAction((ActionEvent e) -> {
                int quantidade = Integer.parseInt(qtd.getText());
                if(quantidade >= 0)
                {
                    quantidade++;
                    qtd.setText(String.valueOf(quantidade));
                }
            });
            
            quantidades.add(qtd);
            idProdutos.add(prod.getIdProduto());
        });
        
    }
    
    public void escolherProdutos()
    {
        idProdutos.forEach(id -> {
            quantidades.forEach(qtd -> {
                if(Integer.parseInt(qtd.getText()) >0 )
                {
                    Logic.escolherProdutos(id, Integer.parseInt(qtd.getText()));
                }
            });
        });
    }
    
    public void printTest()
    {
        HashMap<BigDecimal, Integer> map = Logic.getSelectedProd();
        
        if(map != null)
        {
            System.out.println("IS NOT NULL!!!!");
        }else
        {
            System.out.println("NULL!!!!!!!");
        }
        
    }
    
}

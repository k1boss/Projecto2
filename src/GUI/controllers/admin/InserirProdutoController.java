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
        String id_estabelecimento_text = idEstabelecimentoTextField.getText();
        String preco_text = precoTextField.getText();
        String nome_text = nomeTextField.getText();
        String descricao_text = descricaoTextField.getText();
        
        if (! (allNotNull(id_estabelecimento_text, preco_text, nome_text, descricao_text)
               && allNotEmpty(id_estabelecimento_text, preco_text, nome_text, descricao_text))) {
            // TODO CARLOS print some messages
        }
        
        Logic.insertNewProduto(Integer.parseInt(id_estabelecimento_text),
                            nome_text,
                            Double.parseDouble(preco_text),
                            descricao_text);
    }
    
    public void voltarButtonAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/admin/MenuAdmin.fxml");
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

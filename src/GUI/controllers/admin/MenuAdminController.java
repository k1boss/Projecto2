/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers.admin;

import GUI.Main;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author filip
 */
public class MenuAdminController {
    public void editarProdutosButtonAction(ActionEvent event) throws Exception
    {
        Main.changeScene("/GUI/resources/admin/EditarProdutos.fxml");
    }
    
    public void editarUtilizadoresButtonAction(ActionEvent event) throws Exception
    {
        // TODO choose scene
        Main.changeScene("");
    }
            
    public void editarEstablecimentosButtonAction(ActionEvent event) throws Exception
    {
        // TODO choose scene
        Main.changeScene("");
    }
}

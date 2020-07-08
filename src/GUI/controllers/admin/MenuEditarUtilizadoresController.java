/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers.admin;

import GUI.Main;

/**
 * FXML Controller class
 *
 * @author filip
 */
public class MenuEditarUtilizadoresController {
    public void inserirUtilizadorButtonAction() throws Exception {
        Main.changeScene("/GUI/resources/admin/InserirUtilizador.fxml");
    }
    
    public void editarUtilizadorButtonAction() throws Exception {
        Main.changeScene("/GUI/resources/admin/InserirUtilizador.fxml");
    }
    
    public void voltarButtonAction() throws Exception {
        Main.changeScene("GUI/resources/admin/MenuAdmin.fxml");
    }
}

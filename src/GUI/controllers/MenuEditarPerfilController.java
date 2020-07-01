/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers;

import GUI.Main;

/**
 * FXML Controller class
 *
 * @author Carlos
 */
public class MenuEditarPerfilController
{

    /**
     * Initializes the controller class.
     */
    
    public void mudarUsername() throws Exception
    {
        Main.changeScene("/GUI/resources/MudarUsername.fxml");
    }
    
    public void mudarNome() throws Exception
    {
        Main.changeScene("/GUI/resources/MudarNome.fxml");
    }
    
    public void mudarPassword() throws Exception
    {
        Main.changeScene("/GUI/resources/MudarPassword.fxml");
    }
    
    public void mudarEmail() throws Exception
    {
        Main.changeScene("/GUI/resources/MudarEmail.fxml");
    }
    
    public void voltarBtnAction() throws Exception
    {
        Main.changeScene("/GUI/resources/MenuCliente.fxml");
    }
    
}

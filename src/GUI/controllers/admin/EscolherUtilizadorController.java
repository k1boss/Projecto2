 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.controllers.admin;

import DAL.Cliente;
import GUI.Main;
import Logic.Logic;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author filip
 */
public class EscolherUtilizadorController {
    
    @FXML private ListView clientesList;
    List<Cliente> clientes;
    
    @FXML
    public void initialize() {
        this.clientes = Logic.fetchClientes();
        List<String> nomes_mais_id = new ArrayList();
        for(Cliente cliente : this.clientes) {
            nomes_mais_id.add(cliente.getNome() + "    " + cliente.getIdCliente());
        }
        clientesList.getItems().addAll(nomes_mais_id);
    }
    
    public void confirmarButtonAction() throws Exception {
        String nome_mais_id = clientesList.getSelectionModel().getSelectedItems().toString();
        Pattern id_pattern = Pattern.compile(".*\\s{4}([\\d]+)");
        Matcher m = id_pattern.matcher(nome_mais_id);
        m.find();
        String str_id = m.group(1);
        
        DecimalFormat dm = new DecimalFormat();
        dm.setParseBigDecimal(true);
        BigDecimal id = (BigDecimal) dm.parse(str_id);
        
        for (Cliente cliente : clientes) {
            if(cliente.getIdCliente().equals(id)) {
                Logic.setSelectedClienteOnlyMenu(cliente);
            }
        }
        
        Main.changeScene("/GUI/resources/admin/EditarUtilizador.fxml");
    }
    
    public void voltarButtonAction() throws Exception {
        Main.changeScene("/GUI/resources/admin/MenuAdmin.fxml");
    }
    
}

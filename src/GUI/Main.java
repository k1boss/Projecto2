/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import projecto.Util;

/**
 *
 * @author Carlos
 */
public class Main  extends Application{

    public static void changeScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static private Stage primaryStage;
    static private Class clazz;
    
    
    public static void main(String[] args) {
        Connection conn = Util.criarConexao();
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        clazz = getClass();
        this.primaryStage = primaryStage;        
        primaryStage.setTitle("Application");
        
        //Login scene
        Parent loginRoot = FXMLLoader.load(getClass().getResource("/GUI/resources/Login.fxml"));
        Scene loginScene = new Scene(loginRoot);
        
        //Registar Scene
        Parent registarRoot = FXMLLoader.load(getClass().getResource("/GUI/resources/Registar.fxml"));
        Scene registarScene = new Scene(registarRoot);
        
        primaryStage.setScene(loginScene);
        primaryStage.show();
        
    }
    
    public static void changeScene(String fxml) throws Exception
    {
        Parent pane = FXMLLoader.load(clazz.getResource(fxml));
        
        primaryStage.getScene().setRoot(pane);
    }
    
    public static void createStage(String label, String fxml) throws Exception
    {
        Stage newStage = new Stage();
        newStage.setTitle(label);
        
        Parent pane = FXMLLoader.load(clazz.getResource(fxml));
        Scene newScene = new Scene(pane);
        newStage.setScene(newScene);
        
        newStage.show();
        
    }
    
    
}

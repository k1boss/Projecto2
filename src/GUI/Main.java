/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Logic.Logic;
import java.sql.Connection;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import projecto.Util;

/**
 *
 * @author Carlos
 */
public class Main  extends Application{

    static private Stage primaryStage;
    static private Class clazz;
    
    
    public static void main(String[] args) {
        Connection conn = Util.criarConexao();
        launch(args);
        
        // TODO Esclarecer com o Carlos esta linha porque exception no logout
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            Logic.updateMesaToLivre(Logic.getSelectedMesa().getIdMesa().intValue());
        }, "Shutdown-thread"));
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
    
    public static void createStage(String stageName, String notificationLabel, int width, int height)
    {
        
        
        Stage newStage = new Stage();
        newStage.setTitle(stageName);
        
        Label notification = new Label();
        notification.setText(notificationLabel);
        
        
        Button fecharBtn = new Button();
        fecharBtn.setText("Fechar");
        fecharBtn.setOnAction((ActionEvent event) -> {
            newStage.close();
        });
        
        VBox vbox = new VBox(30);
        
        vbox.getChildren().addAll(notification, fecharBtn);
        vbox.setAlignment(Pos.CENTER);
        StackPane root = new StackPane();
        root.getChildren().addAll(vbox);
        root.setAlignment(Pos.CENTER);
        Scene notificationScene = new Scene(root,width,height);
        
        newStage.sizeToScene();
        
        newStage.setScene(notificationScene);
        newStage.show();
    }
    
    
    
    
}

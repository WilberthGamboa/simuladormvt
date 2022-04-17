package controll;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;



/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        /*
        stage.heightProperty().addListener((obs, oldVal, newVal) -> {
            HBox hbox = (HBox) scene.lookup("#hboxright");
            VBox vbox = (VBox) scene.lookup("#sistemaOperativo");
           double x =  hbox.getHeight();
           x = x*.5;
           System.out.println(x);
          // vbox.setPrefHeight(x);
           vbox.setMaxHeight(x);
          // vbox.setMinHeight(x);
            // Do whatever you want
       });
        */

        stage.setScene(scene);
        stage.show();
    }

    
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
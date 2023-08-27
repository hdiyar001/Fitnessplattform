package Präsentationsschicht;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        primaryStage.getIcons().add(new Image(""));
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

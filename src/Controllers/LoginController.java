package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Diyar
 */
public class LoginController implements Initializable {
//Dependency Injection (DI)

    @FXML
    private TextField tf_userNameLogin;

    @FXML
    private TextField tf_passwordLogin;

    @FXML
    private Label lbl_signup;
    @FXML
    private Button btn_login;

    @FXML
    public void login(ActionEvent e) {
//        Button b = (Button) e.getSource();
        System.out.println(e.getSource() == btn_login);
//        b.getScene().getWindow().hide();
        System.out.println(tf_userNameLogin.getText() + " " + tf_passwordLogin.getText());
    }

    /*  The initialize(URL location, ResourceBundle resources) method in JavaFX is a callback 
        method used for initializing FXML-controlled
        controllers. It is similar to a constructor and is called after the FXML file is loaded
        and the graphical user interface is created,
        allowing you to perform initialization tasks before the UI is displayed to the user.*/
    @Override
    public void initialize(URL location, ResourceBundle resources) {

//        btn_login.setOnAction((event) -> System.out.println("test"));
//
    }
}

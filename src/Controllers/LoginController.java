package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    public void login(ActionEvent e) {
//        Button b = (Button) e.getSource();
//        b.getScene().getWindow().hide();
        System.out.println(tf_userNameLogin.getText() + " " + tf_passwordLogin.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

//        btn_login.setOnAction((event) -> System.out.println("test"));
//
    }
}

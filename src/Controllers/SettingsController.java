package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Diyar
 */
public class SettingsController implements Initializable {

    @FXML
    private Button Language_btn;

    @FXML
    private Button appearance_btn;

    @FXML
    private Button myInfo_btn;

    @FXML
    private Button privacy_btn;

    @FXML
    private Pane languagePane;

    @FXML
    private Pane appearancePane;

    @FXML
    private Pane myInfoPane;

    @FXML
    private Pane privacyPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addEvent();
    }

    private void addEvent() {
        Language_btn.setOnAction((e) ->
        {
            languagePane.toFront();
        });
        appearance_btn.setOnAction((e) ->
        {
            appearancePane.toFront();
        });
        myInfo_btn.setOnAction((e) ->
        {
            myInfoPane.toFront();
        });
        privacy_btn.setOnAction((e) ->
        {
            privacyPane.toFront();
        });
    }
}

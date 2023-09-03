package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import Modell.Modell;

/**
 *
 * @author Diyar
 */
public class DashboardMenuController implements Initializable {

    @FXML
    private Button account_btn;

    @FXML
    private Button dashboard_btn;

    @FXML
    private Button exercise_btn;

    @FXML
    private Button logout_btn;

    @FXML
    private Button report_btn;

    @FXML
    private Button settings_btn;

    @FXML
    private Button statistics_btn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addListener();
    }

    private void addListener() {
        dashboard_btn.setOnAction((e) -> onDashboard());
        account_btn.setOnAction((e) -> onAccount());
    }

    private void onDashboard() {
        Modell.getInstance().getViewFacotry().getClientSelectedMenuItem().set("Dashboard");
    }

    private void onAccount() {
        Modell.getInstance().getViewFacotry().getClientSelectedMenuItem().set("Account");
    }
}

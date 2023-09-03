package View;

import Controllers.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Diyar
 */
public class ViewFactory {

    //DashboardView
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane AccountView;

    public ViewFactory() {
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

    public AnchorPane getDashBoardView() {
        if (dashboardView == null)
        {
            try
            {
                dashboardView = new FXMLLoader(getClass().getResource("/resources/UI/DashboardWindow.fxml")).load();
            } catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        return dashboardView;
    }

    public AnchorPane getAccountView() {
        if (AccountView == null)
        {
            try
            {
                AccountView = new FXMLLoader(getClass().getResource("/resources/UI/AccountWindow.fxml")).load();
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return AccountView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/UI/LogInWindow.fxml"));
        createStage(loader);
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/UI/ClientWindow.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try
        {
            scene = new Scene(loader.load());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("ActiviWave Workouts");
        stage.show();
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}

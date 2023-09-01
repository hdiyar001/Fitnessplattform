package View;

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

    private AnchorPane dashboardView;

    public ViewFactory() {

    }

    public AnchorPane getDashBoardView() {
        if (dashboardView == null)
        {
            try
            {
                dashboardView = new FXMLLoader(getClass().getResource("/resources/UI/Dashboard.fxml")).load();
            } catch (Exception e)
            {
                e.printStackTrace();
            }

        }
        return dashboardView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/UI/LogInWindow.fxml"));
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
        stage.setTitle("Login");
        stage.show();

    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/UI/ClientWindow.fxml"));
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
        stage.setTitle("Login");
        stage.show();

    }

}

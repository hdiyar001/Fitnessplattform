
import Database.DBConection;
import Modell.Modell;
import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.Connection;

/**
 *
 * @author Diyar
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Desgin Pattern
        Modell.getInstance().getViewFacotry().showLoginWindow();
    }

    public static void main(String[] args) {
        Connection connection = DBConection.getInstance().getCon();

        launch();

    }
}

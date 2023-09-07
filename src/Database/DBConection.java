package Database;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diyar
 */
public class DBConection {

//    private String driver = "com.mysql.cj.jdbc.Driver";
//    private String url = "jdbc:mysql://localhost:3304/fitnessplattform";
//    private String user = "root";
//    private String passwd = "MyPassword1234";
    private Dotenv dotenv;
    private String driver;
    private String url;
    private String user;
    private String passwd;
    private Connection con;

    // Singleton-Instanz
    private static DBConection instance;

    public DBConection() {
        try
        {
            dotenv = Dotenv.load();
            driver = dotenv.get("DB_DRIVER");
            url = dotenv.get("DB_URL");
            user = dotenv.get("DB_USER");
            passwd = dotenv.get("DB_PASSWORD");
            System.out.println("Database DRIVER: " + driver);
            System.out.println("Database URL: " + url);
            System.out.println("Database User: " + user);
            System.out.println("Database Password: " + passwd);
            System.out.println("");
            Class.forName(driver);
        } catch (ClassNotFoundException e)
        {
            System.err.println("Keine Treiber-Klasse " + driver
                    + " nicht gefunden!");
            System.exit(1);
        }
    }

    // Öffentliche Methode zur Abfrage der Singleton-Instanz
    public static DBConection getInstance() {
        if (instance == null)
        {
            instance = new DBConection();
        }
        return instance;
    }

    public DBConection(String treiber) {
        driver = treiber;
        try
        {
            Class.forName(driver);
        } catch (ClassNotFoundException e)
        {
            System.err.println("Treiber-Klasse " + driver + " nicht gefunden!");
            System.exit(1);
        }
    }

    public Connection getCon() {
        if (con == null)
        {
            try
            {
                con = DriverManager.getConnection(url, user, passwd);
            } catch (SQLException e)
            {
                System.err.println("Verbindung zur Datenbank " + url
                        + " konnte nicht aufgebaut werden");
                System.err.println("Fehler: " + e);
                con = null;
            }
        } else
        {
            try
            {
                if (!con.isValid(3))
                {
                    con = DriverManager.getConnection(url, user, passwd);
                }
            } catch (SQLException e)
            {
                System.err.println("Verbindung zur Datenbank " + url
                        + " konnte nicht aufgebaut werden");
                System.err.println("Fehler: " + e);
                con = null;
            }
        }
        return con;
    }

    public void close() {
        if (con != null)
        {
            try
            {
                if (!con.isClosed())
                {
                    con.close();
                }
            } catch (SQLException e)
            {
            }
        }
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}

package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Diyar
 */
public class DBConection {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3304/fitnessplattform";
    private String user = "root";
    private String passwd = "MyPassword1234";
    private Connection con;

    public DBConection() {
        try
        {
            Class.forName(driver);
        } catch (ClassNotFoundException e)
        {
            System.err.println("Keine Treiber-Klasse " + driver
                    + " nicht gefunden!");
            System.exit(1);
        }
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

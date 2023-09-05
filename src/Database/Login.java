package Database;

import java.sql.Connection;

/**
 *
 * @author Diyar
 */
public class Login {

    private Connection con;

    public Login(Connection con) {
        this.con = con;
    }

    public boolean emailExists(String email_Or_UserName) {
        return email_Or_UserName.equals("Diyar");
    }

    public boolean passwordExists(String password) {
        return password.equals("1234");
    }

}

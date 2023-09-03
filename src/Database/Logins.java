package Database;

/**
 *
 * @author Diyar
 */
public class Logins {

    public Logins() {
    }

    public boolean emailExists(String email_Or_UserName) {
        return email_Or_UserName.equals("Diyar");
    }

    public boolean passwordExists(String password) {
        return password.equals("1234");
    }

}

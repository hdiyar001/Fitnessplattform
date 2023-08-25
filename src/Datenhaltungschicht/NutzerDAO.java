package Datenhaltungschicht;

public interface NutzerDAO {

    public void addBenutzer_ID(int id);

    public void addBenutzerName(String benutzerName);

    public void setBenutzerName(String benutzerName);

    public void addPasswort(String benutzerPasswort);

    public void setPasswort(String benutzerPasswort);
}

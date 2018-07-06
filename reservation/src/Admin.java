public class Admin extends Person {

    private int personalnummer;

    public Admin(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Admin(String vorname, String nachname, int personalnummer) {
        super(vorname, nachname);
        this.personalnummer = personalnummer;
    }

    public Admin(String vorname, String nachname, String passwort, int personalnummer) {
        super(vorname, nachname, passwort);
        this.personalnummer = personalnummer;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public void addFilm(){

    }
    // blabbla

    public void addVorstellung(){

    }

    public void deleteFilm(){

    }

    public void deleteVorstellung(){

    }


}

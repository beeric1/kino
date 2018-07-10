
// eventuell Factory

import java.util.ArrayList;

public class Film {

    private String titel;
    private String genre;
    private int altersfreigabe;
    private String beschreibung;
    private int bewertung;
    private ArrayList<Vorstellung> vorstellungen;

    public Film(String titel, String genre, int altersfreigabe, String beschreibung, int bewertung) {
        this.titel = titel;
        this.genre = genre;
        this.altersfreigabe = altersfreigabe;
        this.beschreibung = beschreibung;
        this.bewertung = bewertung;
        vorstellungen = null;
    }

    public String getTitel() {
        return titel;
    }

    public String getGenre() {
        return genre;
    }

    public int getAltersfreigabe() {
        return altersfreigabe;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public int getBewertung() {
        return bewertung;
    }
}

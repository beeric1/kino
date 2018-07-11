import java.util.ArrayList;

public class Reservation {

    private Benutzer benutzer;
    private Film film;
    private Vorstellung vorstellung;
    private ArrayList<Sitzplatz> plaetze;
    private String zahlungsart;

    public Reservation(Benutzer benutzer, Film film, Vorstellung vorstellung, ArrayList<Sitzplatz> plaetze, String zahlungsart) {
        this.benutzer = benutzer;
        this.film = film;
        this.vorstellung = vorstellung;
        this.plaetze = plaetze;
        this.zahlungsart = zahlungsart;
    }

    public void confirm(){

        System.out.println("Sie haben gebucht:");
        System.out.println("Film: " + film.getTitel());
        System.out.println("Zeit: " + vorstellung.getZeit());
        System.out.println("Saal: " + vorstellung.getSaal());

        for (Sitzplatz platz: plaetze) {
            System.out.println("Sitzplatz:   Reihe: " +  platz.getReihe() + " Nummer: " + platz.getNummer());
        }
        System.out.println("Zahlungsart: " + zahlungsart);

    }
}

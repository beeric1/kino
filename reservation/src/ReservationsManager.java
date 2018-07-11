import java.util.ArrayList;

public class ReservationsManager {
    private static ReservationsManager ourInstance = new ReservationsManager();
    private ArrayList<Reservation> reservationen;

    public static ReservationsManager getInstance() {
        return ourInstance;
    }

    private ReservationsManager() {
        reservationen = new ArrayList<>();
    }

    public void createReservation(Vorstellung vorstellung, ArrayList plaetze, Benutzer benutzer){

        String zahlungsart;

        System.out.println("Wie möchtens Sie bezhalen?");
        System.out.println("Bar/Karte");
        zahlungsart = InputReader.readString();

        Reservation reservation = new Reservation(benutzer, vorstellung.getFilm(),vorstellung, plaetze,zahlungsart);
        reservationen.add(reservation);

        reservation.confirm();
    }

}

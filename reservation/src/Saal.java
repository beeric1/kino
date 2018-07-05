import java.util.ArrayList;

public class Saal {

    private ArrayList<Sitzplatz> sitzplaetze;
    private int projektionsFaehigkeit;
    // 1 = 1D, 2 = 2D, 3 = 3D, 4 = 4D
    private int anzahlReihen;
    private int anzahlPlaetzeProReihe;

    public Saal(int projektionsFaehigkeit, int anzahlReihen, int anzahlPlaetzeProReihe) {
        this.projektionsFaehigkeit = projektionsFaehigkeit;
        this.anzahlReihen = anzahlReihen;
        this.anzahlPlaetzeProReihe = anzahlPlaetzeProReihe;

        //To do: Generierung von Sitzplätzen
    }
}

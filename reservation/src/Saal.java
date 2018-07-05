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

        //Generierung von Sitzplätzen
        for (int i = 0; i < anzahlReihen ; i++) {

            for (int j = 0; j < anzahlPlaetzeProReihe; j++) {

                sitzplaetze.add(new Sitzplatz(i,j));
            }

        }
    }
}

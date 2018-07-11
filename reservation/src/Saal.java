import java.util.ArrayList;

public class Saal {

    private String name;
    private int projektionsFaehigkeit;
    // 1 = 1D, 2 = 2D, 3 = 3D, 4 = 4D
    private int anzahlReihen;
    private int anzahlPlaetzeProReihe;

    public Saal(String name,int projektionsFaehigkeit, int anzahlReihen, int anzahlPlaetzeProReihe) {
        this.name = name;
        this.projektionsFaehigkeit = projektionsFaehigkeit;
        this.anzahlReihen = anzahlReihen;
        this.anzahlPlaetzeProReihe = anzahlPlaetzeProReihe;
    }

    public int getProjektionsFaehigkeit() {
        return projektionsFaehigkeit;
    }

    public int getAnzahlReihen() {
        return anzahlReihen;
    }

    public int getAnzahlPlaetzeProReihe() {
        return anzahlPlaetzeProReihe;
    }

    public String getName() {
        return name;
    }
}

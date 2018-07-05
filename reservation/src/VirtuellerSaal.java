import java.util.ArrayList;

public class VirtuellerSaal {

    private ArrayList<Sitzplatz> sitzplaetze;
    private Saal physikalischerSaal;

    public VirtuellerSaal(Saal physikalischerSaal) {
        this.physikalischerSaal = physikalischerSaal;

        for (int i = 0; i < physikalischerSaal.getAnzahlReihen() ; i++) {

            for (int j = 0; j < physikalischerSaal.getAnzahlPlaetzeProReihe() ; j++) {

                sitzplaetze.add(new Sitzplatz(i,j));

            }
        }
    }
}




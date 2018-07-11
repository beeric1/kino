import java.util.ArrayList;

public class VirtuellerSaal {

    private ArrayList<Sitzplatz> sitzplaetze;
    private Saal physikalischerSaal;

    public VirtuellerSaal(Saal physikalischerSaal) {
        this.physikalischerSaal = physikalischerSaal;
        sitzplaetze = new ArrayList<>();

        for (int i = 0; i < physikalischerSaal.getAnzahlReihen() ; i++) {

            for (int j = 0; j < physikalischerSaal.getAnzahlPlaetzeProReihe() ; j++) {

                sitzplaetze.add(new Sitzplatz(i,j));

            }
        }
    }

    public Saal getPhysikalischerSaal() {
        return physikalischerSaal;
    }

    public void setSitzplaetze(ArrayList<Sitzplatz> sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }

    public int getFreieSitzplaetze(){
        int counter = 0;

        for (Sitzplatz s: sitzplaetze) {

            if (!s.isGebucht()){
                counter++;
            }
        }

        return counter;
    }
}




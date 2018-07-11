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

    public int getFreieSitzplaetze(){
        int counter = 0;

        for (Sitzplatz s: sitzplaetze) {

            if (!s.isGebucht()){
                counter++;
            }
        }

        return counter;
    }

    public void printLayout(){
        System.out.println("Layout vom Saal " + physikalischerSaal.getName());
        System.out.println("------------------------------------------ Leinwand");

        int reihen = physikalischerSaal.getAnzahlReihen();
        int sitze = physikalischerSaal.getAnzahlPlaetzeProReihe();

        int reihenCounter = 1;
        int sitzCounter = 1;

        for (Sitzplatz platz:sitzplaetze) {

            if(platz.getNummer() == 1){
                System.out.println("  ");
            }

            if(platz.isGebucht()){
                System.out.print("◌");
            }else{
                System.out.print("○");
            }
            if(sitze == platz.getNummer()){
                System.out.print("  Reihe " + reihenCounter);
                ;
            }

        }
        physikalischerSaal.getAnzahlReihen();
        physikalischerSaal.getAnzahlPlaetzeProReihe();



    }
}




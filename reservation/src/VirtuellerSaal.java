import java.util.ArrayList;

public class VirtuellerSaal {

    private ArrayList<Sitzplatz> sitzplaetze;
    private Saal physikalischerSaal;

    public VirtuellerSaal(Saal physikalischerSaal) {
        this.physikalischerSaal = physikalischerSaal;
        sitzplaetze = new ArrayList<>();

        for (int i = 1; i <= physikalischerSaal.getAnzahlReihen() ; i++) {

            for (int j = 1; j <= physikalischerSaal.getAnzahlPlaetzeProReihe() ; j++) {

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

        int anzahlReihen = physikalischerSaal.getAnzahlReihen();
        int anzahlSitze = physikalischerSaal.getAnzahlPlaetzeProReihe();

        int reihenCounter = 1;
        int sitzCounter = 1;

        for (Sitzplatz platz:sitzplaetze) {

            if(platz.getNummer() == 1){
                System.out.println("  ");
            }

            if(platz.isGebucht()){
                System.out.print("◌");
            }else if(platz.isGewaehlt()){
                System.out.print("●");
            }else{
                System.out.print("○");
            }
            if(anzahlSitze == platz.getNummer()){
                System.out.print("  Reihe " + reihenCounter);
                reihenCounter++;
            }

        }

    }

    public Sitzplatz chooseOneSitzplatz(){

        Sitzplatz sitzplatz = null;

        int reihe;
        int nummer;
        int index = 0;

        boolean sitzplatzOK = false;
        boolean reiheOK = false;
        boolean nummerOK = false;

        do{
            System.out.println("Sitzplatz wählen");

            //Reihe wählen
            do {
                printLayout();
                System.out.println(" ");
                System.out.println("Reihe eingeben");
                reihe = InputReader.readInt();
                if(reihe >= 1 && reihe <= physikalischerSaal.getAnzahlReihen()){
                    reiheOK = true;
                }else{
                    reiheOK = false;
                    System.out.println("Ungültige Eingabe");
                }
            }while (!reiheOK);

            //Nummer wählen
            do {
                printLayout();
                System.out.println(" ");
                System.out.println("Nummer eingeben");
                nummer = InputReader.readInt();
                if(nummer >= 1 && nummer <= physikalischerSaal.getAnzahlPlaetzeProReihe()){
                    nummerOK = true;
                }else{
                    nummerOK = false;
                    System.out.println("Ungültige Eingabe");
                }
            }while (!nummerOK);

            for (Sitzplatz sitz: sitzplaetze) {

                if(sitz.getNummer() == nummer && sitz.getReihe() == reihe && !sitz.isGebucht() && !sitz.isGewaehlt()){
                    sitzplatzOK = true;
                    sitzplatz = sitz;
                }
            }

            if(!sitzplatzOK){
                System.out.println("Sitzplatz besetzt oder bereits ausgewählt");
            }

        }while (!sitzplatzOK);

        sitzplatz.setGewaehlt(true);

        return sitzplatz;
    }

    public ArrayList<Sitzplatz> chooseSitzplaetze(){

        ArrayList<Sitzplatz> sitze = new ArrayList<>();

        sitze.add(chooseOneSitzplatz());

        boolean enough = false;
        do{
            String input;
            System.out.println("Noch ein weiterer Sitzplatz?");
            System.out.println("ja    -> j ");
            System.out.println("nein  -> n ");
            input = InputReader.readString();

            if(input.equalsIgnoreCase("j")){
                enough = false;
                sitze.add(chooseOneSitzplatz());
            }else {
                enough = true;
            }

        }while (!enough);


        return sitze;
    }
}




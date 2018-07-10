
// eventuell Observer um zu prüfen ob Vorstellung ausgebucht

import java.util.ArrayList;

public class SaalManager {

    private ArrayList<Saal> saele;

    private Saal saalA;
    private Saal saalB;
    private Saal saalC;
    private Saal saalD;
    private Saal saalE;


    public SaalManager() {

        saele = new ArrayList<>();

        saalA = new Saal("A",4,30,25);
        saalB = new Saal("B",3,25,20);
        saalC = new Saal("C",2,30,25);
        saalD = new Saal("D",2,20,15);
        saalE = new Saal("E",2,15,10);

        saele.add(saalA);
        saele.add(saalB);
        saele.add(saalC);
        saele.add(saalD);
        saele.add(saalE);
    }

    public void printSaele(){

        for (Saal s: saele) {

            System.out.println(s.getName());

        }
    }

    public void updateFreeSeats(){

    }

    public void updateStatusOfSeat(){

    }

    public void bookingRuleCheck(){

    }

}

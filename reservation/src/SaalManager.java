
// eventuell Observer um zu prüfen ob Vorstellung ausgebucht

import java.util.ArrayList;

public class SaalManager {

    private Saal saalA;
    private Saal saalB;
    private Saal saalC;
    private Saal saalD;
    private Saal saalE;


    public SaalManager() {

        saalA = new Saal(4,30,25);
        saalB = new Saal(3,25,20);
        saalC = new Saal(2,30,25);
        saalD = new Saal(2,20,15);
        saalE = new Saal(2,15,10);
    }

    public void updateFreeSeats(){

    }

    public void updateStatusOfSeat(){

    }

    public void bookingRuleCheck(){

    }

}

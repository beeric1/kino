import java.util.ArrayList;

public class SaalManager {

    private ArrayList<Saal> saele;

    private Saal saalA;
    private Saal saalB;
    private Saal saalC;
    private Saal saalD;
    private Saal saalE;

    private static SaalManager ourInstance = new SaalManager();

    public static SaalManager getInstance() {
        return ourInstance;
    }

    private SaalManager() {

        saele = new ArrayList<>();

        saalA = new Saal("A",4,10,10);
        saalB = new Saal("B",3,7,6);
        saalC = new Saal("C",2,10,5);
        saalD = new Saal("D",2,20,15);
        saalE = new Saal("E",2,15,10);

        saele.add(saalA);
        saele.add(saalB);
        saele.add(saalC);
        saele.add(saalD);
        saele.add(saalE);
    }

    public Saal getSaal(int index){
        return saele.get(index);
    }

    public void printSaele(){

        for (Saal s: saele) {

            System.out.println(s.getName() + " " + s.getProjektionsFaehigkeit() + "D  -> " + saele.indexOf(s));

        }
    }

    public void updateFreeSeats(){

    }

    public void updateStatusOfSeat(){

    }

    public void bookingRuleCheck(){

    }
}








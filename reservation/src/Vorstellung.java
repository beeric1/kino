import java.util.Date;

public class Vorstellung {

    private VirtuellerSaal saal;
    private Date zeit;
    private float preis;
    private String sprache;
    private String untertitel;
    private int projektionsart;
    private int freieSitze;


    public Vorstellung(Saal physikalischerSaal, Date zeit, float preis, String sprache, String untertitel, int projektionsart) {
        this.zeit = zeit;
        this.preis = preis;
        this.sprache = sprache;
        this.untertitel = untertitel;
        this.projektionsart = projektionsart;

        //Virtueller Saal erstellen
        saal = new VirtuellerSaal(physikalischerSaal);

        freieSitze = saal.getFreieSitzplaetze();

    }


    public Date getZeit() {
        return zeit;
    }

    public float getPreis() {
        return preis;
    }

    public String getSprache() {
        return sprache;
    }

    public String getUntertitel() {
        return untertitel;
    }

    public int getProjektionsart() {
        return projektionsart;
    }

    public int getFreieSitze() {
        return freieSitze;
    }

    public void setFreieSitze(int freieSitze) {
        this.freieSitze = freieSitze;
    }

    public VirtuellerSaal getSaal() {
        return saal;
    }



}




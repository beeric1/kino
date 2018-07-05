import java.util.Date;

public class Vorstellung {

    private Saal saal;
    private Date zeit;
    private float preis;
    private String sprache;
    private String untertitel;
    private String projektion;
    private int freieSitze;


    public Vorstellung(Saal saal, Date zeit, float preis, String sprache, String untertitel, String projektion) {
        this.saal = saal;
        this.zeit = zeit;
        this.preis = preis;
        this.sprache = sprache;
        this.untertitel = untertitel;
        this.projektion = projektion;
    }

    public Saal getSaal() {
        return saal;
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

    public String getProjektion() {
        return projektion;
    }

    public int getFreieSitze() {
        return freieSitze;
    }

    public void setFreieSitze(int freieSitze) {
        this.freieSitze = freieSitze;
    }




}


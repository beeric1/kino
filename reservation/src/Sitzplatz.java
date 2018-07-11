public class Sitzplatz {

    private int reihe;
    private int nummer;
    private boolean gebucht;
    private boolean gewaehlt;

    public Sitzplatz(int reihe, int nummer) {
        this.reihe = reihe;
        this.nummer = nummer;
        gebucht = false;
        gewaehlt = false;
    }

    public boolean isGebucht() {
        return gebucht;
    }

    public boolean isGewaehlt() {
        return gewaehlt;
    }

    public void setGewaehlt(boolean gewaehlt) {
        this.gewaehlt = gewaehlt;
    }

    public void setGebucht(boolean gebucht) {
        this.gebucht = gebucht;
    }

    public int getReihe() {
        return reihe;
    }

    public int getNummer() {
        return nummer;
    }
}

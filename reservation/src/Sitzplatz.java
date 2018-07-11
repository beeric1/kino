public class Sitzplatz {

    private int reihe;
    private int nummer;
    private boolean gebucht;

    public Sitzplatz(int reihe, int nummer) {
        this.reihe = reihe;
        this.nummer = nummer;
        gebucht = false;
    }

    public boolean isGebucht() {
        return gebucht;
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

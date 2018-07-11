public class Benutzer extends Person{

    private int kundenummer;

    public Benutzer(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Benutzer(String vorname, String nachname, int kundenummer) {
        super(vorname, nachname);
        this.kundenummer = kundenummer;
    }

    public Benutzer(String vorname, String nachname, String passwort,int kundenummer) {
        super(vorname, nachname,passwort);
        this.kundenummer = kundenummer;
    }

    public int getKundenummer() {
        return kundenummer;
    }

    public void setKundenummer(int kundenummer) {
        this.kundenummer = kundenummer;
    }



    public void reserveVorstellung(){

        Film film;
        Vorstellung vorstellung;

        System.out.println("Film auswählen");
        FilmList.getfilmListeInstance().printAlLFilms();
        film = FilmList.getfilmListeInstance().getFilm(InputReader.readInt());

        System.out.println("Vorstellung auswählen");
        film.printAllVorstellungen();
        vorstellung =  film.getVorstellung(InputReader.readInt());
    }
}

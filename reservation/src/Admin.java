
public class Admin extends Person {

    private int personalnummer;

    public Admin(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public Admin(String vorname, String nachname, int personalnummer) {
        super(vorname, nachname);
        this.personalnummer = personalnummer;
    }

    public Admin(String vorname, String nachname, String passwort, int personalnummer) {
        super(vorname, nachname, passwort);
        this.personalnummer = personalnummer;
    }

    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public void createFilm(){

        String titel;
        String genre;
        int altersfreigabe;
        String beschreibung;
        int bewertung;

        System.out.println("Film hinzufügen");
        System.out.println("---------------");

        System.out.println("Titel eingeben");
        titel = InputReader.readString();

        System.out.println("Genre eingeben");
        genre = InputReader.readString();

        System.out.println("Beschreibung eingeben");
        beschreibung = InputReader.readString();

        System.out.println("Altersfreigabe eingeben");
        altersfreigabe = InputReader.readInt();

        System.out.println("Bewertung eingeben");
        bewertung = InputReader.readInt();

        FilmList.getfilmListeInstance().addFilm(new Film(titel,genre,altersfreigabe,beschreibung,bewertung));
        System.out.println("Film hinzugefügt");

    }

    public Film filmChooser(){
        int input = 0;
        System.out.println("Film auswählen");
        System.out.println("---------------");
        FilmList.getfilmListeInstance().printAlLFilms();
        input = InputReader.readInt();

        return FilmList.getfilmListeInstance().getFilm(input);
    }

    public void addVorstellung(){

        Film film = filmChooser();
        System.out.println("Vorstellung hinzufügen");

    }

    public void deleteFilm(){

    }

    public void deleteVorstellung(){

    }


}

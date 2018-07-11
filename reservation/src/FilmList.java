
//Singleton

import java.util.ArrayList;

public class FilmList {
    private static FilmList filmListeInstance = new FilmList();

    private ArrayList<Film> filme;

    public static FilmList getfilmListeInstance() {
        return filmListeInstance;
    }

    private FilmList() {
        filme = new ArrayList<>();

        //Test Data
        filme.add(new Film("Herr der Ringe","Fantasy",12,"Super Film",5));
        filme.add(new Film("Cars","Antimation",3,"Auto Film",3));
    }

    public ArrayList getFilme(){
        return filme;
    }

    public void addFilm(Film film){
        filme.add(film);
    }

    public Film getFilm(int index){
        return filme.get(index);
    }

    public void printAlLFilms(){
        for (Film f: filme) {
            System.out.println(f.getTitel() + " -> " + filme.indexOf(f) );
        }
    }
}

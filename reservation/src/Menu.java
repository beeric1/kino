import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private String input;
    private Scanner scan;

    private ArrayList<Admin> admins;
    private ArrayList<Benutzer> users;

    private Admin admin1;
    private Admin admin2;

    private Benutzer user1;
    private Benutzer user2;

    public Menu() {

        scan = new Scanner(System.in);

        admins = new ArrayList<>();
        users = new ArrayList<>();

        // Benutzer anlegen
        admin1 = new Admin("Rolf","Meier","apfel2",2345);
        admin2 = new Admin("Lara","Croft","aprikose3",1345);
        admins.add(admin1);
        admins.add(admin2);

        user1 = new Benutzer("Frank","Larm","melone1",123);
        user2 = new Benutzer("Anna","Mock","banane5",223);
        users.add(user1);
        users.add(user2);

    }

    public void menu(){
        do {
            System.out.println("Hauptmenü");
            System.out.println("------------------");
            System.out.println("Admin              -> a");
            System.out.println("User               -> u");
            System.out.println("Programm beenden   -> exit");

            input = scan.nextLine();

            switch (input.toLowerCase()){
                case "a":
                    adminMenu();
                    break;
                case "u":
                    userMenu();
                    break;
                case "exit":
                    System.out.println("Applikation beendet");
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
            }

        }while (!input.equalsIgnoreCase("exit"));
    }

    // Returnes "logged in" Admin
    public Admin adminLogin(){

        Admin admin = null;
        String vorname = null;
        boolean loginCorrect = false;

        do{
            System.out.println("Admin Login");
            System.out.println("------------------");

            //Vorname
            boolean nameFound = false;
            do {
                System.out.println("Vorname eingeben");
                input = scan.nextLine();

                for (Admin a: admins) {

                    if(a.getVorname().equalsIgnoreCase(input)){
                        nameFound = true;
                        System.out.println("Vorname gefunden");
                        vorname = a.getVorname();
                    }
                }

                if(!nameFound){
                    System.out.println("Vorname unbekannt");
                }

            }while (!(nameFound || input.equalsIgnoreCase("back")));


            if(!input.equalsIgnoreCase("back")){

                //Passwort
                boolean passwordCorrect = false;
                do {
                    System.out.println("Passwort eingeben");
                    input = scan.nextLine();

                    for (Admin a: admins) {

                        if(a.getPasswort().equals(input) && a.getVorname().equals(vorname)){
                            passwordCorrect = true;
                            System.out.println("Passwort korrekt");
                            admin = a;
                            loginCorrect = true;
                        }
                    }

                    if(!passwordCorrect){
                        System.out.println("Passwort falsch");
                    }

                }while (!(passwordCorrect || input.equalsIgnoreCase("back")));
            }



        }while(!(loginCorrect || input.equalsIgnoreCase("back")) );

        return admin;
    }


    public void adminMenu(){

        Admin admin = adminLogin();

        if(admin != null){

            do {
                System.out.println("Admin Menü");
                System.out.println("------------------");
                System.out.println("Film erstellen         -> f");
                System.out.println("Vorstellung erstellen  -> v");
                System.out.println("Film löschen           -> fl");
                System.out.println("Vorstellung löschen    -> vl");
                System.out.println("Zurück ins Hauptmenü   -> back");

                input = scan.nextLine();

                switch (input.toLowerCase()){
                    case "f":
                        admin.addFilm();
                        break;
                    case "v":
                        admin.addVorstellung();
                        break;
                    case "fl":
                        admin.deleteFilm();
                        break;
                    case "vl":
                        admin.deleteVorstellung();
                        break;
                    case "back":
                        System.out.println("zurück zum");
                        break;
                    default:
                        System.out.println("Ungültige Eingabe");
                }

            }while (!input.equalsIgnoreCase("back"));
        }

    }

    public void userMenu(){
        do {
            System.out.println("User Menü");
            System.out.println("------------------");
            System.out.println("Vorstellung buchen     -> f");
            System.out.println("Zurück ins Hauptmenü   -> exit");

        }while (!input.equalsIgnoreCase("exit"));

    }
}

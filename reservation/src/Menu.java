import java.util.Scanner;

public class Menu {

    private String input;
    private Scanner scan;

    private Admin admin1;
    private Admin admin2;

    private Benutzer user1;
    private Benutzer user2;

    public Menu() {

        scan = new Scanner(System.in);

        // Benutzer anlegen
        admin1 = new Admin("Rolf","Meier",2345);
        admin2 = new Admin("Lara","Croft",1345);

        user1 = new Benutzer("Frank","Larm",123);
        user2 = new Benutzer("Anna","Mock",223);

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
                case "u":
                    userMenu();
                case "exit":
                    System.out.println("Applikation beendet");
                default:
                    System.out.println("Ungültige Eingabe");
            }

        }while (!input.equalsIgnoreCase("exit"));
    }


    public Admin adminLogin(){
        Admin admin = null;
        System.out.println("Admin Login");
        System.out.println("------------------");

        //Todo: Admin auswählen

        return admin;
    }


    public void adminMenu(){

        Admin admin = adminLogin();

        do {
           System.out.println("Admin Menü");
           System.out.println("------------------");
           System.out.println("Film erstellen         -> f");
           System.out.println("Vorstellung erstellen  -> v");
           System.out.println("Film löschen           -> fl");
           System.out.println("Vorstellung löschen    -> vl");
           System.out.println("Zurück ins Hauptmenü   -> exit");

            input = scan.nextLine();

            switch (input.toLowerCase()){
                case "f":
                    admin.addFilm();
                case "v":
                    admin.addVorstellung();
                case "fl":
                    admin.deleteFilm();
                case "vl":
                    admin.deleteVorstellung();
                case "exit":
                    System.out.println("zurück zum");
                default:
                    System.out.println("Ungültige Eingabe");
            }

        }while (!input.equalsIgnoreCase("exit"));
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

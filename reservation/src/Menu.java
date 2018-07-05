import java.util.Scanner;

public class Menu {

    private String input;
    private Scanner scan;

    private Admin rolf;

    public Menu() {

        scan = new Scanner(System.in);

        // Benutzer anlegen
        rolf = new Admin("Rolf","Meier",2345);
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


    public void adminLogin(){
        System.out.println("Admin Login");
        System.out.println("------------------");

    }


    public void adminMenu(){

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

                case "v":
                    userMenu();
                case "fl":
                    adminMenu();
                case "vl":
                    userMenu();
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

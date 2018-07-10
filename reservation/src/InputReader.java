import java.util.InputMismatchException;
import java.util.Scanner;

//Todo Singleton implementieren

public class InputReader {

    private static Scanner scan = new Scanner(System.in);

    public InputReader() {


    }

    public static String readString(){

        return scan.nextLine();
    }

    public static int readInt(){
        int output = 0;
        boolean inputCorrect;
        do{
            try {
                output = scan.nextInt();
                inputCorrect = true;
            }catch (InputMismatchException ex){
                System.out.println("Ungültige Eingabe, bitte Zahl eingeben");
                inputCorrect = false;
            }

        }while (!inputCorrect);

        return output;
    }
}

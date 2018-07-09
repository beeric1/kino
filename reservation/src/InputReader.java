import java.util.InputMismatchException;
import java.util.Scanner;

//Todo Singleton implementieren

public class InputReader {

    private Scanner scan;

    public InputReader() {

        scan = new Scanner(System.in);
    }

    public String readString(){
        String output = null;
        output = scan.nextLine();
        return output;
    }

    public Integer readInteger(){
        Integer output = 0;
        boolean inputCorrect = false;
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

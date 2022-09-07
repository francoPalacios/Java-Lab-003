
import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");

        int number = scanner.nextInt();

        double celsius = (number - 32.0) *  (5.0/9.0);
        double Two = (celsius + 2.0);


        System.out.println(number + "°F");
        System.out.println(celsius + "°C");
        System.out.printf("%.0f °C" +"", celsius);
        System.out.println();
        System.out.printf("If it were 2°C warmer it would be: %f", Two);


    }
}

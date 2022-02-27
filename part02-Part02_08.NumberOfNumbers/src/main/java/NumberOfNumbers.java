
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value2 = 0;
        int value;
        while (true) {
            System.out.println("Give a number:");
            value = Integer.valueOf(scanner.nextLine());
            if (value == 0) {
                System.out.println("Number of numbers: " + value2);
                break;
            }
            value2 = value2 + 1;
            

        }
    }
}

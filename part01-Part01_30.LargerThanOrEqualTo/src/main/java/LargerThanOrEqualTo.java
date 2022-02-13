
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int value2 = Integer.valueOf(scan.nextLine());
        if (first > value2) {
            System.out.println("Greater number is:" + first);
        } else if (first < value2) {
            System.out.println("Greater number is: " + value2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}


import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String name = String.valueOf(scan.nextLine());
        System.out.println("Give an integer:");
        int value = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double a = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean w = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + name);
        System.out.print("You gave the integer ");
        System.out.println(value);
        System.out.print("You gave the double " );
        System.out.println(a);
        System.out.print("You gave the boolean ");
        System.out.println(w);
    }
}

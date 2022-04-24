
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int counter = 0;
        int counterodd = 0;
        int countereven = 0;
        double average = 0;
        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers == -1) {
                break;
            } else {
                counter = counter + 1;
                sum = sum + numbers;
                if (numbers % 2 == 0) {
                    countereven = countereven + 1;
                } else {
                    counterodd = counterodd + 1;
                }
            }
            
        }
        
        average = (double) sum/ (double)counter;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + countereven);
        System.out.println("Odd: " + counterodd);
    }
    
    
}

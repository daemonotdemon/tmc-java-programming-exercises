
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
        int numberOfNumbers = 0;
        double averageOfNumbers = 0.0;
        int evenNumbers = 0;
        int oddNumbers = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1){
                break;
            } else {
                if(input % 2 == 0){
                    ++evenNumbers;
                } else {
                    ++oddNumbers;
                }
                sum += input;
                ++numberOfNumbers;
                continue;
            }

        }
        averageOfNumbers = (double) sum / numberOfNumbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numberOfNumbers);
        System.out.println("Average: " + averageOfNumbers);
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}

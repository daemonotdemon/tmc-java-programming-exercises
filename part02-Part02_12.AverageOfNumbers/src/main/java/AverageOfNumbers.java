
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0.0;
        double numbers = 0.0;
        double numberOfNumbers = 0.0;

        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 0){
                break;
            } else if (number < 0 || number > 0){
                numberOfNumbers += 1;
                numbers += number;
                average = numbers / numberOfNumbers;
                continue;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}

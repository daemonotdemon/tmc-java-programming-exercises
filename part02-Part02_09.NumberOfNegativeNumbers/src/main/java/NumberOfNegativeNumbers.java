
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        int numberOfNegatives = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 0){
                break;
            } else if(number < 0){
                numberOfNegatives += 1;
                continue;
            } else {
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + numberOfNegatives);
    }
}

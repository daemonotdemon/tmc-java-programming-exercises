
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int numberByUser = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for(int i = 0;i <= numberByUser;i++){
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}

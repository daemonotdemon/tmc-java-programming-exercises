
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        if (number < 0) {
            int conversion = number * -1;
            System.out.println(conversion);
        } else {
            System.out.println(number);
        }
    }
}

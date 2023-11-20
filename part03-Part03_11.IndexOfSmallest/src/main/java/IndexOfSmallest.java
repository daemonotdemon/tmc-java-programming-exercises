import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring 2 Lists, one to take care of the inputs
        // and other to take care of the index in which they are located later on
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> index = new ArrayList();
        // Variable int named input will be used in the loop to read user input
        int input = 0;
        while(true){
            input = Integer.valueOf(scanner.nextLine());
            // If the user enters the number 9999 the loop breaks
            if(input == 9999){
                break;
            }
            // Otherwise, it just adds the input to the list
            numbers.add(input);
        }
        // Declaring an integer variable which contains the first element of the list
        // this is because, I think it's better to treat the first element as the smallest at the beginning
        int smallest = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++){
            // This condition checks if the variable smallest 
            // is greater than the number at the index i present on list numbers
            if(smallest > numbers.get(i)){
                smallest = numbers.get(i);
                // I thought it was better to implement the index at which the numbers are located
                // as an List of itself, that way I could just store them until later use
                index.add(i);
            }
        }
        // After the loop, the program prints the smallest number inputted
        System.out.println("Smallest number: " + smallest);
        // This other loop (a for-each loop) just loops the index List and tells
        // the user at what index the smallest number is located
        // if it is present in more than one index, it will print all of them
        for(int i : index){
            System.out.println("Found at index: " + i);
        }
    }
}

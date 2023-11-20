
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i != number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 0;
        int sizeTriangle = size - (size - 1);
        int numberOfSpaces = size - 1;
        while(i != size){
            printSpaces(numberOfSpaces);
            printStars(sizeTriangle);
            i++;
            sizeTriangle++;
            numberOfSpaces--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int i = 0;
        int sizeTree = height - (height - 1);
        int numberOfSpaces = height - 1;
        while(i != height){
            printSpaces(numberOfSpaces);
            printStars(sizeTree);
            i++;
            sizeTree += 2;
            numberOfSpaces--;
        }
        for(int a = 0; a < 2; a++){
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

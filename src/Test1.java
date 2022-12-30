import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a double: ");
        double myDouble = userInput.nextDouble();
        System.out.println("Please enter an integer: ");
        int myInt = userInput.nextInt();

        double intToDouble = myInt; // Casting from a narrower data type to a wider
                                    // data type is done auto matically
        int doubleToint = (int) myDouble; // Casting from a wider data type to a narrower
                                          // one is done manually
        System.out.println(intToDouble);
        System.out.println(doubleToint);
    }
}

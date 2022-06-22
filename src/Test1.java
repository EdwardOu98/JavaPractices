import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        double myDouble = 3.5;
        int myInt = 1;

        double intToDouble = myInt; // Casting from a narrower data type to a wider
                                    // data type is done auto matically
        int doubleToint = (int) myDouble; // Casting from a wider data type to a narrower
                                          // one is done manually
        System.out.println(intToDouble);
        System.out.println(doubleToint);
    }
}

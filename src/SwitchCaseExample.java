import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        // Use a scanner class to handle user inputs
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int n = userInput.nextInt();

        switch (n) {
            case 1:
                System.out.println("n is 1");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("n is between 2 and 5 (inclusive)");
                break;
            default:
                System.out.println("n is not in range");
        }
    }
}

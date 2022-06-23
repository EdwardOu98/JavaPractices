public class MathExamples {
    public static void main(String[] args) {
        // Generate random number between 0 and 9 for x and y
        int x = (int) (Math.random() * 10), y = (int) (Math.random() * 10);
        // Print the maximum
        System.out.println(Math.max(x, y));
        // Print the minimum
        System.out.println(Math.min(x, y));

        // Print the square root of 64
        System.out.println("The square root of 64 is " + Math.sqrt(64));

        // Print the absolute value of -10
        System.out.println("The absolute value of -10 is " + Math.abs(-10));
    }
}

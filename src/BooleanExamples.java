public class BooleanExamples {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10), y = (int) (Math.random() * 10);

        if(x == y) {
            System.out.println("x is equal to y");
        }
        else if(x < y) {
            System.out.println("x is smaller than y");
        }
        else {
            System.out.println("x is greater than y");
        }
    }
}

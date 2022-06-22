public class StringExamples {
    public static void main(String[] args) {
        String myString = "Hello World";

        // Get length of string
        System.out.println("The length of myString is " + myString.length());

        // Convert all characters in the string to lower case
        System.out.println(myString.toLowerCase());
        // Convert all characters in the string to upper case
        System.out.println(myString.toUpperCase());

        // Use the indexOf method to locate a word
        System.out.println("The word \"World\" starts at index " + myString.indexOf("World"));

        // String concatenation
        String firstName = "Edward ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);

        // Adding a number and a string is the same as string concatenation
        int x = 20;
        String y = "22";
        System.out.println(x + y);
    }
}

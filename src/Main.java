public class Main {
    public static void main(String[] args) {
        printBetween('a', 'f');
        System.out.println();
//        printBetween('f', 'a');
    }
    // Recursive method to print characters in between two unicode characters
    static void printBetween(char start, char end) {
        // Base case: when start is beyond end, stop recursion
        if (start > end) {
            return;
        }

        // Print the current character
        System.out.print(start + " ");

        // Recursive call to print the next character
        printBetween((char) (start + 1), end);
    }
}

public class Question2 {

    public static int sumDigits(int number) {
        // Helper method to handle tail recursion with an accumulator
        return sumDigitsTail(number, 0);
    }

    // Tail recursive helper method with an accumulator
    private static int sumDigitsTail(int number, int accumulator) {
        // Base case: when number is 0, return the accumulated sum
        if (number == 0) {
            return accumulator;
        }

        // Recursive case: add the last digit to the accumulator and call recursively
        return sumDigitsTail(number / 10, accumulator + (number % 10));
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(583));
    }
}
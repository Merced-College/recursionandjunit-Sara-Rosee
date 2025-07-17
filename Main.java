// Sara Filipinas
// 7.16.25
// Recursion and JUnit test assignment

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello, World");
    }

    public static int count8(int n) {
        // if the number is 0, there are no digits left to check
        if (n == 0) return 0;
        // get the last digit of the current number
        int lastDigit = n % 10;
        // get second to last digit
        int nextToLastDigit = (n / 10) % 10;
        // check if digit is 8
        if (lastDigit == 8) {
            // If the second-to-last digit is also 8, count this one as double (2 points)
            if (nextToLastDigit == 8) {
                return 2 + count8(n / 10); // add 2 and continue with the rest of the number
            } else {
                // Otherwise, count this 8 as normal (1 point)
                return 1 + count8(n / 10); // count normally
            }
        } else {
            // If the last digit is not 8, just move to the next digit without counting
            return count8(n / 10);
        }
    }



}
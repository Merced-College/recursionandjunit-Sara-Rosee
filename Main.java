// Sara Filipinas
// 7.16.25
// Recursion and JUnit test assignment

public class Main {
    public static void main(String[] args)
    {
        System.out.println("testing");
    }
    
    // Problem 1: You're given a number like 8818, and you need to count how many times the digit 8 appears in it
    // Rule: If an 8 has another 8 right next to it on the left, it should count double
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

    // Problem 2: Take in a string and count how many times 'hi' appears in it
    public static int countHi(String str) {
        // if fewer than 2 characters, stop because can't possibly contain hi
        if (str.length() < 2) {
            return 0;
        }
        // If the string starts with "hi", count it and recurse from str.substring(2)
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        }
        // Otherwise, move one character ahead and keep checking
        return countHi(str.substring(1));
    }

    // Problem 3: compute the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' 
    // immediately before them
    public static int countHi2(String str) {
        // if less than 2 characters, can't contain "hi"
        if (str.length() < 2) {
            return 0;
        }
        // If string starts with "xhi", skip 'x' and move forward
        if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            return countHi2(str.substring(3));  // skip the whole "xhi"
        }
        // If string starts with "hi", count it and skip past it
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        // Otherwise, just move forward one character
        return countHi2(str.substring(1));
    }

    // Problem 4
    // compute recursively the number of times that sub appears in the string, without the sub strings overlapping
    public static int countSub(String str, String sub) {
        // if string is shorter than sub return 0 because it will cannot be the sub
        if (str.length() < sub.length()) {
            return 0;
        }
        // If str starts with sub
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + countSub(str.substring(sub.length()), sub);
        }
        // Else, move forward one character
        return countSub(str.substring(1), sub);
    }



}
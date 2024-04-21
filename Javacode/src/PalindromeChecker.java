public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int original = number;

        while (original > 0) {
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original /= 10;
        }

        return number == reversed;
    }

    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}

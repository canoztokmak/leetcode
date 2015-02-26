package leetcode.java;

// leetcode - palindrome number
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x < 0) return false;

        int digit = (int)Math.log10(x) + 1;

        for (int i = 1; i <= digit/2; i++) {
            int right = (x % (int)Math.pow(10, i));
            int left = (x / (int)Math.pow(10, digit-i));

            if (i > 1) {
                right = right / (int)Math.pow(10, i-1);
                left = left % 10;
            }

            if (right != left) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(103401));

    }

}

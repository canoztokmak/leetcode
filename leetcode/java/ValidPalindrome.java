package leetcode.java;

//leetcode - valid palindrome
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        char[] value = s.toLowerCase().replaceAll("([\\.,?;:!\\#$%&/()=\\-*@'\"`]|\\s)", "").trim().toCharArray();


        for (int i = 0; i < value.length / 2; i++) {
            if (value[i] != value[value.length-1 - i]) return false;
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("`l;`` 1o1 ??;l`"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("I, man, am regal; a German am I."));

    }

}

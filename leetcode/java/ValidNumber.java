package leetcode.java;

// leetcode - valid number
public class ValidNumber {

    public static boolean isNumber(String s) {

        try {
            System.out.println(Double.parseDouble(s.trim()));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(isNumber("0"));
        System.out.println(isNumber(" 0.1"));
        System.out.println(isNumber("abc"));
        System.out.println(isNumber("1 a"));
        System.out.println(isNumber("2e10"));
        System.out.println(isNumber("959440.94f"));

    }

}

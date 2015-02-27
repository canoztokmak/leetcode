package java;

import java.util.HashMap;
import java.util.Map;

//leetcode - roman to integer
public class RomanToInteger {

    private static Map<Character, RomanDigit> cache = new HashMap<Character, RomanDigit>();

    private enum RomanDigit {
        I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

        int val;

        RomanDigit(int val) {
            this.val = val;
        }

        public static RomanDigit parse(char c) {
            String s = ""+c;
            for (RomanDigit rd : values()) {
                if(rd.name().equalsIgnoreCase(s)) return rd;
            }
            throw new RuntimeException();
        }
    }

    private static RomanDigit getDigit(char c) {
        RomanDigit rd = cache.get(c);
        if (rd == null) {
            rd = RomanDigit.parse(c);
            cache.put(c, rd);
        }
        return rd;
    }

    public static int romanToInt(String s) {

        int result = 0;
        int i = 0;
        char[] arr = s.toCharArray();
        while (i < s.length()) {

            RomanDigit rd = getDigit(arr[i]);
            RomanDigit rdNext = null;
            if (i+1 < s.length()) {
                rdNext = getDigit(arr[i + 1]);
            }

            if (rdNext != null && rdNext.val > rd.val) {
                result += rdNext.val - rd.val;
                i++;
            } else {
                result += rd.val;
            }

            i++;

        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(romanToInt("MMMCMXCIX"));

    }

}

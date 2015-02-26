package leetcode.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//leetcode - ascii to integer
public class Atoi {

    public static int atoi(String str) {

        Pattern p = Pattern.compile("(\\+|-)?([0-9]+)");
        Matcher m = p.matcher(str);

        if (m.matches()) {

            String s = m.group();
            boolean isNegative = false;
            if (s.contains("+") && s.contains("-")) return 0;
            if (s.contains("-")) isNegative = true;
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                if (isNegative) return Integer.MIN_VALUE;
                else return Integer.MAX_VALUE;
            }

        }
        return 0;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(atoi(in.next()));

    }


}

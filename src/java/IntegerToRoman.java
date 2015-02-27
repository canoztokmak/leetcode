package java;

// leetcode - integer to roman
public class IntegerToRoman {

    private enum RomanDigit {
        I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

        int val;

        RomanDigit(int val) {
            this.val = val;
        }
    }

    private static RomanDigit[] values = new RomanDigit[] {RomanDigit.M,
            RomanDigit.CM, RomanDigit.D, RomanDigit.CD, RomanDigit.C,
            RomanDigit.XC, RomanDigit.L, RomanDigit.XL, RomanDigit.X,
            RomanDigit.IX, RomanDigit.V, RomanDigit.IV, RomanDigit.I};

    public static String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        for (RomanDigit rd : values) {
            while (num >= rd.val) {
                sb.append(rd.name());
                num -= rd.val;
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(intToRoman(3999));

    }

}

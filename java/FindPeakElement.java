package javaexamples.leetcode;

/**
 * Created by oztokmakc on 02/02/15.
 */
//leetcode - find peak element
public class FindPeakElement {

    public static int findPeakElement(int[] num) {

        if (num.length == 1) return 0;

        for (int i = 0; i < num.length; i++) {

            if (i == 0) {
                if (num[i] > num[i+1])
                    return i;
            } else if (i == num.length-1) {
                if (num[i] > num[i-1])
                    return i;
            } else {
                if (num[i] > num[i-1] && num[i] > num[i+1])
                    return i;
            }
        }

        return 0;

    }


    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{1, 2, 3, 4}));
        System.out.println(findPeakElement(new int[]{1}));


    }

}

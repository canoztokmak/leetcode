package java;

//leetcode - unique paths
public class UniquePaths {

    private static long factorial(long k) {
        if (k <= 1) return 1;
        else return k * factorial(k-1);
    }

    public static int uniquePaths(int m, int n) {

        int min = Math.min(m-1, n-1);

        int sum = m+n-2;

        long result = 1;
        for (int i = 0; i < min; i++) {
            result *= sum--;
        }

        return (int) (result / factorial(min));
    }

    public static void main(String[] args) {

        System.out.println(uniquePaths(2, 2));

    }

}

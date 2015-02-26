package leetcode.java;

public class MaximalRectangle {

    public static int maximalRectangle(char[][] matrix) {

        int heightMin = Integer.MAX_VALUE, heightMax = Integer.MIN_VALUE;
        int widthMin = Integer.MAX_VALUE, widthMax = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {

            if (matrix[i].length == 0) return 0;

            boolean found = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    found = true;
                    if (j < widthMin) widthMin = j;
                    if (j > widthMax) widthMax = j;
                }
            }
            if (found) {
                if (i < heightMin) heightMin = i;
                if (i > heightMax) heightMax = i;
            }

        }

        if (heightMax >= 0) {
            return (Math.abs(heightMax-heightMin)+1) * (Math.abs(widthMax-widthMin)+1);
        } else return 0;

    }

    public static void main(String[] args) {

        System.out.println(maximalRectangle(new char[][]{
                        {'0','1','0','1','0'},
                        {'0','0','0','0','0'},
                        {'0','0','0','0','0'},
                        {'0','1','0','1','0'},
                        {'0','0','0','0','0'}
                }));
        System.out.println(maximalRectangle(new char[][]{{'1'}
                }));

    }

}

package java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// leetcode - valid sudoku
public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        return isColumnsValid(board) && isRowsValid(board) && isGroupsValid(board);
    }

    private static boolean isColumnsValid(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> chars = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.') continue;
                if (chars.contains(ch)) return false;
                else chars.add(ch);
            }
        }
        return true;

    }

    private static boolean isRowsValid(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> chars = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                char ch = board[j][i];
                if (ch == '.') continue;
                if (chars.contains(ch)) return false;
                else chars.add(ch);
            }
        }
        return true;

    }

    private static boolean isGroupsValid(char[][] board) {

        for (int i = 0; i < 9; i=i+3) {
            for (int j = 0; j < 9; j=j+3) {
                Set<Character> chars = new HashSet<Character>();
                for (int k = i; k < 3+i; k++) {
                    for (int l = j; l < 3+j; l++) {
                        char ch = board[k][l];
                        if (ch == '.') continue;
                        if (chars.contains(ch)) return false;
                        else chars.add(ch);
                    }
                }
            }
        }
        return true;

    }

    private static char[][] convert(List<String> list) {
        char[][] arr = new char[9][9];

        int i = 0;
        for (String s : list) {
            System.arraycopy(s.toCharArray(), 0, arr[i++], 0, 9);
        }

        return arr;
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add(".87654321");
        list.add("2........");
        list.add("3........");
        list.add("4........");
        list.add("5........");
        list.add("6........");
        list.add("7........");
        list.add("8........");
        list.add("9........");

        System.out.println(isValidSudoku(convert(list)));

    }

}

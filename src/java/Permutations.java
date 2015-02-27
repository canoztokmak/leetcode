package java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode - permutations
public class Permutations {

    public static <T> List<List<T>> helper(List<T> src) {
        List<List<T>> list = new ArrayList<List<T>>();
        if (src.size() == 1) list.add(src);
        else {
            for (T i : src) {
                List<T> dest = new ArrayList<T>(src);
                dest.remove((T)i);
                List<List<T>> results = helper(dest);
                for(List<T> l : results) {
                    l.add(0, i);
                }
                list.addAll(results);
            }
        }
        return list;
    }

    public static <T> List<List<T>> permute(T[] num) {

        List<T> src = new ArrayList<T>();
        src.addAll(Arrays.asList(num));

        return helper(src);

    }

    public static void main(String[] args) {

        System.out.println(permute(new Integer[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(permute(toCharArray("abcdefghij")));

    }

    private static Character[] toCharArray(String s) {

        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        return arr;

    }

}

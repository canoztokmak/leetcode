package leetcode.java;

//leetcode - reverse words in a string
public class ReverseWords {

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            sb.append(words[i].trim());
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseWords("   a   b "));

    }

}

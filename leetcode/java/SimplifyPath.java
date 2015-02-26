package leetcode.java;

import java.util.Stack;

//leetcode - simplify path
public class SimplifyPath {

    public static String simplifyPath(String path) {

        String[] tokens = path.split("/");

        Stack<String> stack = new Stack<String>();
        for (String s : tokens) {
            if (s.equalsIgnoreCase("")) continue;

            if (s.equals(".")) continue;

            if (s.equalsIgnoreCase("..")) {
                if (!stack.empty()) stack.pop();
            } else {
                stack.push(s);
            }

        }

        StringBuilder sb = new StringBuilder();
        sb.append("/");
        while(!stack.empty()) {
            sb.insert(1, stack.pop());
            if (!stack.empty()) sb.insert(1, "/");
        }
        return sb.toString();

    }

    public static void main(String[] args) {

        System.out.println(simplifyPath("/a/./b/../../c/d"));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("/home//foo/"));

    }

}

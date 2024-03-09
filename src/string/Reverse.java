package string;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String s1 = "Welcome to good life";

//        reverseW(s1);
        reverseWords(s1.toCharArray(), s1.length());
    }

    static void reverseW(String s1) {
        Stack<String> stack = new Stack<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                end = i;
                stack.push(s1.substring(start, end));
                start = i + 1;
            }

        }

        stack.push(s1.substring(start));

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        s1 = sb.toString().trim();

        System.out.print(s1);
    }

    static void reverse(char str[], int low, int high) {
        while (low <= high) {
            //swap
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            //
            low++;
            high--;
        }
    }

    static void reverseWords(char str[], int n) {
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n - 1);
        reverse(str, 0, n - 1);
    }
}

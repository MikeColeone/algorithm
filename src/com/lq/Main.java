//import java.util.Scanner;
//
//public class Main {
//
//    // 判断字符串是否是回文
//    public static boolean isPalindrome(String s) {
//        int l = 0, r = s.length() - 1;
//        while (l < r) {
//            if (s.charAt(l) != s.charAt(r)) return false;
//            l++;
//            r--;
//        }
//        return true;
//    }
//
//    // 尝试往前添加 l/q/b 使其变为回文
//    public static String canFormPalindrome(String s) {
//        StringBuilder prefix = new StringBuilder();
//        for (int i = 0; i <= s.length(); i++) {
//            String candidate = prefix.toString() + s;
//            if (isPalindrome(candidate)) return "Yes";
//            // 枚举所有前缀添加情况：尝试加 l、q、b
//            if (i < s.length()) {
//                char c = s.charAt(i);
//                if (c == 'l' || c == 'q' || c == 'b') {
//                    prefix.append(c);  // 把当前字符当作要加在前面的字符
//                } else {
//                    break; // 无法再加，停止尝试
//                }
//            }
//        }
//        return "No";
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int t = 0; t < n; t++) {
//            String s = scanner.nextLine().trim();
//            System.out.println(canFormPalindrome(s));
//        }
//
//    }
//}

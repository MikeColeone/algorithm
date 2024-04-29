import java.util.Scanner;
public class demo_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        Solution p = new Solution();

            p.longestPalindrome(s);


        System.out.println(p.longestPalindrome(s));
    }

}

class Solution {
    //判断是否回文
    public boolean judge(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)) break;
            else {
                i++;
                j--;
            }
        }
       // System.out.println(i==j);
        return i==j;
    }
    //寻找字串
    public String longestPalindrome(String s) {
        String ans = null;
        int max = -1;
        int j = 1;
        while (j < s.length()) {
            for (int i = 0; i <= s.length() - 1; i++) {
                //定义字串长度
                if (i + j <= s.length()) {
                   // System.out.println(i+"  "+j+"   "+i+j);
                    if (judge(s.substring(i, i + j))) {
                       // System.out.println(i+"  "+j);

                       // System.out.println(s.substring(i,i+j+1));
                        ans = s.substring(i, j+1);
                        if (i + j >= max)
                            max = j + 1;
                        break;
                    }
                }
            }
            j++;
        }
        return ans;
    }
}

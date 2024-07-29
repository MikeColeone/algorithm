//import java.util.Scanner;
//
//class Solution {
//    public int countBeautifulPairs(int[] nums) {
//        int ans = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int p = nums[i];
//                int q = nums[j];
//                while(p>=10){
//                    p = p/10;
//                }
//                q = q%10;
//                if(findPrime(p,q)==1){
//                    System.out.println(nums[i]+" "+nums[j]);
//                    System.out.println(p+" "+q);
//                    ans++;
//                }
//            }
//        }
//        return ans;
//    }
//    //当返回值为1的时候互质 否则为最大公约数
//    public int findPrime(int a, int b){
//        return b==0?a:findPrime(b,a%b);
//
//
//    }
//}
//
//public class demo_2748{
//    public static int[] arr = new int[100];
//    public static void main(String[] args) {
//        int n;
//        Scanner sc = new Scanner(System.in);
//        Solution p = new Solution();
//        n = sc.nextInt();
//        //读入数据
//        while(sc.hasNext()){
//            for(int i = 0; i < n; i++){
//                arr[i]=sc.nextInt();
//            }
//            int x = p.countBeautifulPairs(arr);
//            System.out.println(x);
//        }
//    }
//}
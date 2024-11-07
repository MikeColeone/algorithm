import java.util.Scanner;


//相当于每一次之去判断之前互质的数出现几次 将i j暗含在一次遍历 利用初始最高位次数都是1 实现j的先行一步
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int[] cnt = new int[10]; //存放最高位出现次数 为什么存放最高位 而不是最低为 因为j先行一步 数组需要存储所有前面的值的出现次数 也不需要担心重复的问题 其实是一种打表思想
        int ans = 0;
        for(int t : nums){
            for (int i = 1;i<10;i++){
                //首先最高位得存在该数字 然后判断是或否互质
                if(cnt[i]!=0){
                    boolean jud = findPrime(i, t % 10) == 1;
                    if(jud){
                        ans+=cnt[i];
                    }
                }
            }
            while(t>=10){
                t/=10;
            }
            cnt[t]++;
        }
        return ans;
    }

    public int findPrime(int a, int b){
        return b==0?a:findPrime(b,a%b);

    }
}

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
//    public int findPrime(int a, int b){
//        return b==0?a:findPrime(b,a%b);
//
//    }
//}

public class demo_2748{
    public static int[] arr = new int[100];
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Solution p = new Solution();
        n = sc.nextInt();
        //读入数据
        while(sc.hasNext()){
            for(int i = 0; i < n; i++){
                arr[i]=sc.nextInt();
            }
            int x = p.countBeautifulPairs(arr);
            System.out.println(x);
        }
    }
}
import java.util.HashMap;
import java.util.Map;
//
//public class Solution {
//    public long countSubarrays(int[] nums, int k) {
//        Map<Integer, Integer> countMap = new HashMap<>();
//        int n = nums.length;
//        long ans = 0;
//        int l = 0;
//        int max = Integer.MIN_VALUE;
//
//        for (int r = 0; r < n; r++) {
//            countMap.put(nums[r], countMap.getOrDefault(nums[r], 0) + 1);
//            if (nums[r] > max) {
//                max = nums[r];
//            }
//
//            // while 当前最大值出现次数 >= k
//            while (countMap.getOrDefault(max, 0) >= k) {
//                ans += n - r;
//                countMap.put(nums[l], countMap.getOrDefault(nums[l], 0) - 1);
//
//                // 注意：无论 nums[l] 是不是 max，我们都要重新判断当前窗口 max
//                // 因为 max 的 count 可能已经 < k
//                if (countMap.getOrDefault(max, 0) < k) {
//                    max = findMax(countMap);
//                }
//
//                l++;
//            }
//        }
//
//        return ans;
//    }
//
//    private int findMax(Map<Integer, Integer> map) {
//        int maxVal = Integer.MIN_VALUE;
//        for (int key : map.keySet()) {
//            if (map.get(key) > 0 && key > maxVal) {
//                maxVal = key;
//            }
//        }
//        return maxVal;
//    }
//
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        int[] nums = {28,5,58,91,24,91,53,9,48,85,16,70,91,91,47,91,61,4,54,61,49};
//        int k = 3;
//        System.out.println(s.countSubarrays(nums, k)); // 应该输出正确结果
//    }
//}

/*不是子数组的最大值 而是数组的最大值*/
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int mx = Arrays.stream(nums).max().getAsInt();
        long ans = 0;
        int cnt = 0, left = 0;
        for (int x : nums) {
            if (x == mx) {
                cnt++;
            }
            while (cnt == k) {
                if (nums[left] == mx) {
                    cnt--;
                }
                left++;
            }
            ans += left;
        }
        return ans;
    }
}
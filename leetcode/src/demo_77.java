//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//public class demo_77 {
//    public static void main(String[] args) {
//
//    }
//}
//
////class Solution {
////    private int k;
////    private final LinkedList<Integer> p = new LinkedList<>();
////    private final List<List<Integer>> ans = new ArrayList<>();
////    public void tracking(int n,int k,int startIndex){
////        if(p.size()==k){
////            ans.add(p);
////            return;
////        }
////
////        for (int i = startIndex;i<=n;i++){
////            p.add(i);
////            tracking(n,k,i+1);
////            p.removeLast();
////        }
////    }
////    public List<List<Integer>> combine(int n, int k) {
////        tracking(n,k,1);
////        return ans;
////    }
////}
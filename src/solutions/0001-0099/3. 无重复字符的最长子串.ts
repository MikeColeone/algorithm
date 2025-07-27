function lengthOfLongestSubstring(s: string): number {
    //维护一个滑动窗口
    let ans = 0;
    let l = 0;
    let r = 0;
    let mySet = new Set();
    while (r < s.length){
        if(!mySet.has(s.charAt(r))){
            mySet.add(s.charAt(r));
            ans = Math.max(ans,r-l+1);
            r++;

        }else{
            mySet.delete(s.charAt(l));
            l +=1;
        }
    }

    return ans;
};

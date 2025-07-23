class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxlen = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curnum = num;
                int curlen = 1;
                while(set.contains(curnum+1)){
                    curnum++;
                    curlen++;
                }
                maxlen = Math.max(maxlen,curlen);
            }
        }
        return maxlen;
    }
}
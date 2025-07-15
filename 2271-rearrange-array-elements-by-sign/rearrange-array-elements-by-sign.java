class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int num : nums){
            if(num > 0){
                pos.add(num);
            }
            else{
                neg.add(num);
            }
        }
        int[] res = new int[n];
        int i=0, p=0, ne=0;
        while(i<n){
            res[i++] = pos.get(p++);
            res[i++] = neg.get(ne++);
        }
        return res;
    }
}
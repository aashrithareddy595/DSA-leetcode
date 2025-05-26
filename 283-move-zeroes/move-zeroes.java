class Solution {
    public void moveZeroes(int[] nums) {
        int nonZero = 0;
        for(int num : nums){
            if(num!=0){
                nums[nonZero++] = num;

            }
        }
        while(nonZero < nums.length){
            nums[nonZero++] = 0;
        }
    }
}
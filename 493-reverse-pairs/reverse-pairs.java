class Solution {
    public int reversePairs(int[] nums) {
    //brute force with TC = O(n2)
        // if(nums.length<2) return 0;

        // int count = 0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]>2*nums[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;

    //optimal with merge sort with TC = O(nlogn)
    if(nums == null || nums.length == 0) return 0;

    return mergeSort(nums,0,nums.length-1);
    }
    public int mergeSort(int[] nums, int left, int right){
        if(left>=right) return 0;

        int mid = left + (right - left) / 2;
        int count = mergeSort(nums,left,mid) + mergeSort(nums,mid+1,right);
        int j = mid + 1;
        for(int i=left;i<=mid;i++){
            while(j<=right && (long)nums[i] > 2L * nums[j]){
                j++;
            }
            count += j - (mid + 1);
        }

        Arrays.sort(nums,left,right+1);
        return count;
    }
}
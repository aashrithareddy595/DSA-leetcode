class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1 = 0;
        int c2 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for(int num : nums){
            if(num == c1){
                cnt1++;
            }
            else if(num == c2){
                cnt2++;
            }
            else if(cnt1 == 0){
                c1 = num;
                cnt1 = 1;
            }
            else if(cnt2 == 0){
                c2 = num;
                cnt2 = 1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }

        List<Integer> res = new ArrayList<>();
        cnt1 = 0; cnt2 = 0;
        for(int num : nums){
            if(num == c1){
                cnt1++;
            }
            else if(num == c2){
                cnt2++;
            }
        }
        if(cnt1 > nums.length / 3) res.add(c1);
        if(cnt2 > nums.length / 3) res.add(c2);
        return res;
    }
}
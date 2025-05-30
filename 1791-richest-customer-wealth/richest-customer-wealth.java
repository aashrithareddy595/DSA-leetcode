class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;

        for(int[] customer : accounts){
            int sum = 0;
            for(int money : customer){
                sum += money;
            }
            if(sum > maxwealth){
                maxwealth = sum;
            }
        }
        return maxwealth;
    }
}
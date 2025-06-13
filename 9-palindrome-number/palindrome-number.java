class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int rev = 0;
        while(x>rev){
            int dig = x%10;
            x = x/10;
            rev = rev*10 + dig;
        }
        return x == rev || x == rev/10;
    }
}
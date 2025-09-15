class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int rev = 0;
        while(x>0){
            int lastdig = x%10;
            x = x/10;
            rev = rev*10 + lastdig;
        }
        if(rev == dup){
            return true;
        }
        else{
            return false;
        }

    }
}
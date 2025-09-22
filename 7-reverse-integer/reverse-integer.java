class Solution {
    public int reverse(int n) {
        int rev = 0;
        while(n!=0){
            int lastdig = n%10;
            n = n/10;
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && lastdig>7) return 0;
            if(rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && lastdig<-8) return 0;
            rev = rev*10 + lastdig;
        }
        return rev;
    }
}
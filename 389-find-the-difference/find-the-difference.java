class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        for(char ch : s.toCharArray()){
            xor = xor^ch;
        }
        for(char ch : t.toCharArray()){
            xor = xor^ch;
        }
        return (char) xor;
    }
}
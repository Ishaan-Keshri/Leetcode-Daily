class Solution {
    public int maximumScore(int a, int b, int c) {
        int ta,tb,tc;
        tc=Math.max(a,Math.max(b,c));
        ta=Math.min(a,Math.min(b,c));
        
        return Math.min((a+b+c)/2,ta+(a+b+c-tc-ta));
    }
}
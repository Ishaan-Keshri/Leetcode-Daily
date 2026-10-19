class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        int i=5;
        while(n/i>=1)
        {
            c+=n/i;
            i*=5;
        }
        return c;
    }
}
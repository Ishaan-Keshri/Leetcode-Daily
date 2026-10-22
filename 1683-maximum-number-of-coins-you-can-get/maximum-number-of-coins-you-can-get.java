class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n=piles.length;
        int c=n/3,i=n-2,ans=0;
        while(c--!=0)
        {
            ans+=piles[i];
            i=i-2;
        }
        return ans;
    }
}
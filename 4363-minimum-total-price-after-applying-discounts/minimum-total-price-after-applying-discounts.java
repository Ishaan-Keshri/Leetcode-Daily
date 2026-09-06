class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int p=prices.length-1;
        int d=discounts.length-1;
        int idx=d;
        double min=0;
        for(int i=p;i>=0;i--)
        {
            if(idx>=0)
            {
                min+=(prices[i] * (100.0 - discounts[idx])) / 100.0;
                idx--;
            }
            else{
                min+=prices[i];
            }
        }
        return min;
    }
}
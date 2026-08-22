class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int[prices.length];
        int i=0;
        for(i=0;i<prices.length-1;i++)
        {
            if(prices[i+1]<=prices[i])
            {
                ans[i]=prices[i]-prices[i+1];
            }
            else
            {
                int j=i+1;
                boolean f=false;
                while(j<prices.length)
                {
                    if(prices[j]<=prices[i])
                    {
                        ans[i]=prices[i]-prices[j];
                        f=true;
                        break;
                    }
                    else{
                        j++;
                    }
                }
                if(f==false)
                {
                    ans[i]=prices[i];
                }
            }
        }
        ans[prices.length-1]=prices[prices.length-1];
        return ans;
    }
}
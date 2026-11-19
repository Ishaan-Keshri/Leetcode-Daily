class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int b=numBottles;
        int ans=b;
        int c=0;
        while(b>=numExchange)
        {
            b=b-numExchange;
            numExchange++;
            c++;
            if(b<numExchange)
            {
                ans+=c;
                b+=c;
                c=0;
            }
        }
        return ans;
    }
}
class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;;i++)
        {
            int j=i;
            int p=1;
            while(j!=0)
            {
                p=p*(j%10);
                j=j/10;
            }
            if(p%t==0)
            {
                return i;
            }
        }
    }
}
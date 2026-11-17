class Solution {
    public int numSub(String s) {
        int n=s.length();
        int c=0;
        int mod=(int)Math.pow(10,9)+7;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                c++;
                ans=(ans+c)%mod;
            }
            else{
                c=0;
            }
        }
        return ans;
    }
}
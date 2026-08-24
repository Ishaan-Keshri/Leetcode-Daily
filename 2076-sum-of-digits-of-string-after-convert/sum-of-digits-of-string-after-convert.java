class Solution {
    public int getLucky(String s, int k) {
        int n=s.length();
        int num=0;
        for(int i=0;i<n;i++)
        {
            int ch=(int)(s.charAt(i)-'a'+1);
            num+=ch%10;
            num+=ch/10;
        }
        for(int i=1;i<k;i++)
        {
            num=help(num);
        }
        return num;
    }
    public int help(int n)
    {
        int s=0;
        while(n!=0)
        {
            s=s+(n%10);
            n=n/10;
        }
        return s;
    }
}
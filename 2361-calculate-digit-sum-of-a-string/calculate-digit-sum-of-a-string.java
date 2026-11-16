class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        while(n>k)
        {
            String m="";
            for(int i=0;i<n;i+=k)
            {
                m+=sum(s.substring(i,Math.min(i+k,n)));
            }
            s=m;
            n=s.length();
        }
        return s;
    }
    private String sum(String n)
    {
        int s=0;
        for(int i=0;i<n.length();i++)
        {
            s+=n.charAt(i)-'0';
        }
        return String.valueOf(s);
    }
}
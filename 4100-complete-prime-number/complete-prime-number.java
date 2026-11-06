class Solution {
    public boolean completePrime(int num) {
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++)
        {
            if((!prime(Integer.parseInt(s.substring(0,i+1))))||!prime(Integer.parseInt(s.substring(s.length()-1-i,s.length()))))
            {
                return false;
            }
        }
        return true;
    }
    private boolean  prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
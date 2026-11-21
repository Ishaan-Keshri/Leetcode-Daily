class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int r=k-1;
        int n=s.length();
        int max=0;
        int c=0;
        for(int i=l;i<=r;i++)
        {
            if(isVowel(s.charAt(i)))
                {
                    c++;
                }
        }
        max=c;
        r++;
        while(r<n)
        {
            if(isVowel(s.charAt(l)))
            {
                c--;
            }
            if(isVowel(s.charAt(r)))
            {
                c++;
            }
            max=Math.max(c,max);
            l++;
            r++;
        }
        return max;
    }
    private boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
        {
            return true;
        }
        return false;
    }
}
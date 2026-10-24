class Solution {
    public boolean doesAliceWin(String s) {
        int v=0;
        for(char ch:s.toCharArray())
        {
            if(isVowel(ch))
            {
                v++;
            }
        }
        if(v==0)
        {
            return false;
        }
        return true;
    }
    private boolean isVowel(char ch)
    {
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
       {
        return true;
       }
       return false;
    }
}
class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        int c=0;
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                c++;
            }
        }
        if(c==0 || c==n ||(c==1 && Character.isUpperCase(word.charAt(0))==true))
        {
            return true;
        }
        return false;
    }
}
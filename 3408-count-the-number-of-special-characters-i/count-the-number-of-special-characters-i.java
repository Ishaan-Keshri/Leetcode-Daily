class Solution {
    public int numberOfSpecialChars(String word) {
        int fs[]=new int[26];
        int fc[]=new int[26];
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch))
            {
                fc[ch-'A']++;
            }
            else{
                fs[ch-'a']++;
            }
        }
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(fc[i]!=0 && fs[i]!=0)
            {
                c++;
            }
        }
        return c; 
    }
}
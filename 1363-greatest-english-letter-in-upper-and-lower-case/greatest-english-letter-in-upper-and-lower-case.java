class Solution {
    public String greatestLetter(String s) {
        int fs[]=new int[26];
        int fc[]=new int[26];
        for(char ch:s.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                fc[ch-'A']++;
            }
            else{
                fs[ch-'a']++;
            }
        }
        String ch="";
        for(int i=25;i>=0;i--)
        {
            if(fs[i]!=0 && fc[i]!=0)
            {
                ch=""+(char)(i+'A');
                break;
            }
        }
        return ch;
    }
}
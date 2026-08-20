class Solution {
    public int minimizedStringLength(String s) {
        int f[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(f[i]!=0)
            {
                c++;
            }
        }
        return c;
    }
}
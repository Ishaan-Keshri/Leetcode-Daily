class Solution {
    public int minimumLength(String s) {
        int f[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
        }
        int min=0;
        for(int i=0;i<26;i++)
        {
            if(f[i]==0)
            {
                continue;
            }
            else if(f[i]%2==0)
            {
                min+=2;
            }
            else{
                min+=1;
            }
        }
        return min;
    }
}
class Solution {
    public String sortString(String s) {
        StringBuilder sb=new StringBuilder();
        int f[]=new int[26];
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            f[s.charAt(i)-'a']++;
            c++;
        }
        while(c!=0)
        {
            for(int i=0;i<26;i++)
            {
                if(f[i]!=0)
                {
                    sb.append((char)('a'+i));
                    f[i]--;
                    c--;
                }
            }
            for(int i=25;i>=0;i--)
            {
                if(f[i]!=0)
                {
                    sb.append((char)('a'+i));
                    f[i]--;
                    c--;
                }
            }
        }
        return String.valueOf(sb);
    }
}
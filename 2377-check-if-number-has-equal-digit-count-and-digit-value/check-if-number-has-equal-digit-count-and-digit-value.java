class Solution {
    public boolean digitCount(String num) {
        int f[]=new int[10];
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            f[ch-'0']++;
        }
        for(int i=0;i<num.length();i++)
        {
            char ch=num.charAt(i);
            if(f[i]!=ch-'0')
            {
                return false;
            }
        }
        return true;
    }
}
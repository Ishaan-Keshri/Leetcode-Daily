class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        int d=k;
        String result="";
        for(int i=0;i<n;i+=k)
        {
            result+=encode(s.substring(i,d));
            d+=k;
        }
        return result;
    }
    private char encode(String m)
    {
        int sum=0;
        for(int i=0;i<m.length();i++)
        {
            sum+=m.charAt(i)-'a';
        }
        sum=sum%26;
        return (char)(sum+'a');
    }
}
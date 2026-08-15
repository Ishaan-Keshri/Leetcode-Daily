class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0;
        int t1=0;
        int i=0;
        for(i=0;i<s.length();i++)
        {
            s1+=(int)s.charAt(i);
            t1+=(int)t.charAt(i);
        }
        t1+=(int)t.charAt(i);
        int diff=t1-s1;
        return (char)diff;
    }
}
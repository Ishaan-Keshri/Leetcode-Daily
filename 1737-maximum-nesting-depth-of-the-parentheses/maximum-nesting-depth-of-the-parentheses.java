class Solution {
    public int maxDepth(String s) {
        int l=0,r=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                l++;
            }
            else if(ch==')')
            {
                r++;
            }
            max=Math.max(max,l-r);
        }
        return max;
    }
}
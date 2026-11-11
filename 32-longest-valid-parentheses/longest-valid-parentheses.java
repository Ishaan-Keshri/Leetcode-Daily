class Solution {
    public int longestValidParentheses(String s) {
        int op=0,cl=0;
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                op++;
            }
            else{
                cl++;
            }
            if(op==cl)
            {
                max=Math.max(max,2*op);
            }
            else if(cl>op)
            {
                op=0;
                cl=0;
            }
        }
        op=0;
        cl=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='(')
            {
                op++;
            }
            else{
                cl++;
            }
            if(op==cl)
            {
                max=Math.max(max,2*op);
            }
            else if(op>cl)
            {
                op=0;
                cl=0;
            }
        }
        return max;
    }
}
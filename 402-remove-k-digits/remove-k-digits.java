class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            while(!st.empty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0'))
            {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        if(st.empty())
        {
            return "0";
        }
        String res="";
        while(!st.empty())
        {
            res=st.pop()+res;
        }
        /*if(res.equals("0"))
        {
            return res;
        }*/
        while(res.charAt(0)=='0' && res.length()>1)
        {
            res=res.substring(1,res.length());
        }
        /*if(res.equals(""))
        {
            return "0";
        }*/
        return res;
    }
}
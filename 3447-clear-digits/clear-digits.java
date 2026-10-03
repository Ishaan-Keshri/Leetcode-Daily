class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                st.push(ch);
            }
            else{
                if(!st.isEmpty() && !Character.isDigit(st.peek()))
                {
                    st.pop();
                }
            }
        }
        String ns="";
        while(!st.isEmpty())
        {
            ns=st.pop()+ns;
        }
        return ns;
    }
}
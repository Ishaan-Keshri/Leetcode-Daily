class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else if(st.peek()!=ch)
            {
                st.push(ch);
            }
            else{
                st.pop();
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
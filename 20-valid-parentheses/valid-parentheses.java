class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
            {
                st.push(c);
            }
            else
            {
                if(st.empty())
                {
                    return false;
                }
                char ch=st.pop();
                if((c==')' && ch=='(')||(c=='}' && ch=='{')||(c==']' && ch=='['))
                {
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.empty();
    }
}
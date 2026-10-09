class Solution {
    public int minInsertions(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    if(i<s.length()-1 && s.charAt(i+1)==')')
                    {
                        i++;
                    }
                    else{
                        c++;
                    }
                    c++;
                }
                else
                {
                    if(i < s.length()-1 && s.charAt(i+1) == ')') {
                        i++;
                    }
                    else {
                        c++;
                    }
                    st.pop();
                }
            }
        }
        return c+st.size()*2;
        }
        
    }
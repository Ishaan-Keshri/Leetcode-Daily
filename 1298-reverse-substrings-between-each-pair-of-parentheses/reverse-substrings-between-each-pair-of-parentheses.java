class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==')')
            {
                String sb="";
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    sb+=stack.pop();
                }
                stack.pop();
                for(int j=0;j<sb.length();j++)
                {
                    stack.push(sb.charAt(j));
                }
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder ns=new StringBuilder();
        while(!stack.isEmpty())
        {
            ns.append(stack.pop());
        }
        return ns.reverse().toString();
    }
}
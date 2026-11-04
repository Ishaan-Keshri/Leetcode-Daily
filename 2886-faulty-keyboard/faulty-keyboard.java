class Solution {
    public String finalString(String s) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='i')
            {
                sb.reverse();
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
}
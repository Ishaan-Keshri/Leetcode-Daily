class Solution {
    public String rearrangeString(String s, char x, char y) {
        String c="",f="";
        String ns="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==x)
            {
                c+=x;
            }
            else if(ch==y)
            {
                f+=y;
            }
            else{
                ns+=ch;
            }
        }
        ns=ns+f+c;
        return ns;
    }
}
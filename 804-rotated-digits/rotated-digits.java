class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(good(i)==true)
            {
                c++;
            }
        }
        return c;
    }
    public boolean good(int n)
    {
        String sb=String.valueOf(n);
        StringBuilder s=new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);
            if(ch=='3' || ch=='4' || ch=='7')
            {
                return false;
            }
            else if(ch=='0' || ch=='1' || ch=='8')
            {
                s.append(ch);
            }
            else if(ch=='2'){
                s.append('5');
            }
            else if(ch=='5'){
                s.append('2');
            }
            else if(ch=='6'){
                s.append('9');
            }
            else{
                s.append('6');
            }
        }
        if(sb.equals(s.toString()))
        {
            return false;
        }
        return true;
    }
}
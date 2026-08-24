class Solution {
    public String thousandSeparator(int n) {
        if(n<1000)
        {
            return String.valueOf(n);
        }
        String s="";
        int c=0;
        while(n>0)
        {
            int d=n%10;
            c++;
            if(c==3)
            {
                s="."+String.valueOf(d)+s;
                c=0;
            }
            else{
                 s=String.valueOf(d)+s;
            }
           
            n=n/10;
        }
        if(s.charAt(0)=='.')
        {
            s=s.substring(1,s.length());
        }
        
        return s;
    }
}
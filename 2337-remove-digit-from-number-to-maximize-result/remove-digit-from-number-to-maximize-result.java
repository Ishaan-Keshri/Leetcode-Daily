class Solution {
    public String removeDigit(String number, char digit) {
        int index=0;
        for(int i=0;i<number.length();i++)
        {
            char ch=number.charAt(i);
            if(ch==digit)
            {
                index=i;
                if(i<number.length()-1 && digit<number.charAt(i+1))
                {
                    break;
                }
            }
        }
        String s=number.substring(0,index)+number.substring(index+1);
        return s;
    }
}
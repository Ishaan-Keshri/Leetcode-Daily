class Solution {
    public String largestOddNumber(String num) {
        int p=-1;
        for(int i=0;i<num.length();i++)
        {
            int d=num.charAt(i) - '0';
            if(d%2!=0)
            {
                p=i;
            }
        }
        return p==-1?"":num.substring(0,p+1);
    }
}
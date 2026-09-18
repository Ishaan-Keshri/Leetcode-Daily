class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        for(int i=1;i<=(int)num/2;i++)
        {
            if(num%i==0)
            {
                s=s+i;
            }
        }
        if(s==num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
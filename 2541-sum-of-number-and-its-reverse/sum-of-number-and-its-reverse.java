class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++)
        {
            int temp=i;
            int r=0;
            while(temp!=0)
            {
                r=(r*10)+temp%10;
                temp/=10;
            }
            if(r+i==num)
            {
                return true;
            }
        }
        return false;
    }
}
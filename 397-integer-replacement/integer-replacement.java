class Solution {
    public int integerReplacement(int n) {
        int c=0;
        long num=n;
        while(num!=1)
        {
            num=num%2==0?num/2:(num==3?num-1:num%4==1?num-1:num+1);
            c++;
        }
        return c;
    }
}
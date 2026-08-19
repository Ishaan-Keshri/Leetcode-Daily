class Solution {
    public boolean judgeCircle(String moves) {
        char[] arr=moves.toCharArray();
        int u=0,d=0,l=0,r=0,i=0;
        while(i<arr.length)
        {
            if(arr[i]=='U')
            {
                u++;
            }
            else if(arr[i]=='D')
            {
                d++;
            }
            else if(arr[i]=='R')
            {
                r++;
            }
            else
            {
                l++;
            }
            i++;
        }
        if(u==d && r==l)
        {
            return true;
        }
        return false;
    }
}
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0,u=0;
        for(int i=0;i<moves.length();i++)
        {
            char ch=moves.charAt(i);
            if(ch=='L')
            {
                l++;
            }
            else if(ch=='R')
            {
                r++;
            }
            else{
                u++;
            }
        }
        if(l>r)
        {
            return l-r+u;
        }
        else if(r>l)
        {
            return r-l+u;
        }
        return u;
    }
}
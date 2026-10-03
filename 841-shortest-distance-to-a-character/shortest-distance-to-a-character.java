class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                l.add(i);
            }
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==c)
            {
                res[i]=0;
            }
            else{
                int min=Integer.MAX_VALUE;
                for(int j:l)
                {
                    min=Math.min(min,(Math.abs(j-i)));
                }
                res[i]=min;
            }
        }
        return res;
    }
}
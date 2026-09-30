class Solution {
    public int[] scoreValidator(String[] events) {
        int s=0,c=0;
        for(int i=0;i<events.length;i++)
        {
            if(events[i].equals("W"))
            {
                c++;
                if(c==10)
                {
                    break;
                }
            }
            else if(events[i].equals("WD") || events[i].equals("NB"))
            {
                s++;
            }
            else{
                int r=Integer.parseInt(events[i]);
                s+=r;
            }
        }
        int ans[]=new int[2];
        ans[0]=s;
        ans[1]=c;
        return ans;
    }
}
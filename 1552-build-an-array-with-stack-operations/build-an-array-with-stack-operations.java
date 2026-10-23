class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list=new ArrayList<>();
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(target[c]==i)
            {
                list.add("Push");
                c++;
                if(target.length==c)
                {
                    break;
                }
            }
            else
            {
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}
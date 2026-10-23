class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> ans=new ArrayList<>();
        for(int i=0;i<l.length;i++)
        {
            ans.add(check(nums,l[i],r[i]));
        }
        return ans;
    }
    private boolean check(int[] nums, int start, int end)
    {
        if(end-start+1<2)
        {
            return false;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=start;i<=end;i++)
        {
            list.add(nums[i]);
        }
        Collections.sort(list);
        int d=list.get(1)-list.get(0);
        for(int i=1;i<list.size()-1;i++)
        {
            if(list.get(i+1)-list.get(i)!=d)
            {
                return false;
            }
        }
        return true;
    }
}
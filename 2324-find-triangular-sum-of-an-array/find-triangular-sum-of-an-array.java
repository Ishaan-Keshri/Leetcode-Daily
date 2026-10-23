class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1)
        {
            return nums[0];
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++)
        {
            list.add((nums[i]+nums[i+1])%10);
        }
        while(list.size()!=1)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<list.size()-1;i++)
            {
                temp.add((list.get(i)+list.get(i+1))%10);
            }
            list.clear();
            list=(ArrayList)temp.clone();
        }
        return list.get(0);
    }
}
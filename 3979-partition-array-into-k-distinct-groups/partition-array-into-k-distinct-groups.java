class Solution {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length%k!=0)
        {
            return false;
        }
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        int g=nums.length/k;
        for(int c:mpp.values())
        {
            if(c>g)
            {
                return false;
            }
        }
        return true;
    }
}
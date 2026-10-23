class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int max=nums[0],min=nums[0];
        int c=1;
        for(int i:nums)
        {
            max=Math.max(max,i);
            min=Math.min(min,i);
            if(max-min>k)
            {
                c++;
                max=min=i;
            }
        }
        return  c;
    }
}
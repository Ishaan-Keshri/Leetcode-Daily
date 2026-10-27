class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i+=2)
        {
            int t=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=t;
        }
        return nums;
    }
}
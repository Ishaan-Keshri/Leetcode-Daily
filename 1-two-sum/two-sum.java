class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int a[]=new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                a[0]=i;
                a[1]=mpp.get(moreNeeded);
                return a;
            }

            mpp.put(nums[i], i);
        }
        return a;
    }
}
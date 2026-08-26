class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            st.add(nums[i]);
        } 
        while(st.contains(original))
        {
            original=original*2;
        }
        return original;
    }
}
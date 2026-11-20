class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(!set.contains(nums2[i]) && !l2.contains(nums2[i]))
            {
                l2.add(nums2[i]);
            }
        }
        set.clear();
        for(int i=0;i<nums2.length;i++)
        {
            set.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(!set.contains(nums1[i]) && !l1.contains(nums1[i]))
            {
                l1.add(nums1[i]);
            }
        }
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}
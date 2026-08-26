class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int f[]=new int[1001];
        ArrayList<Integer> ans=new ArrayList<>();
        int n1=nums1.length;
        int n2=nums2.length;
        for(int i=0;i<n1;i++)
        {
            f[nums1[i]]++;
        }
        for(int i=0;i<n2;i++)
        {
            if(f[nums2[i]]!=0 )
            {
                ans.add(nums2[i]);
                f[nums2[i]]--;
            }
        }
        int arr[]=new int[ans.size()];
        int j=0;
        for(int i:ans)
        {
            arr[j]=i;
            j++;
        }
        return arr;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=firstp(nums,n,target);
        int a[]=new int[2];
        if(first==-1)
        {
            a[0]=-1;
            a[1]=-1;
            return a;
        }
        int last=lastp(nums,n,target);
        a[0]=first;
        a[1]=last;
        return a;
    }
    public int firstp(int[] nums,int n,int x)
    {
        int low=0,high=n-1;
        int first=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==x)
            {
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return first;
    }
    public int lastp(int[] nums,int n,int x)
    {
        int low=0,high=n-1;
        int last=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==x)
            {
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return last;
    }
}
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
            int s=0;
            for(int j=i;j<nums.size();j++)
            {
                int n=j-i+1;
                s+=nums.get(j);
                if(n>=l && n<=r && s>0)
                {
                    sum=Math.min(s,sum);
                }
                else if(n>r){
                    break;
                }
            }
        }
        if(sum==Integer.MAX_VALUE)
        {
            return -1;
        }
        return sum;
    }
}
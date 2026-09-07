class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n: nums)
        {
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        int c=0;
        for(int f:freq.values())
        {
            if(f==1)
            {
                return -1;
            }
            c+=(f+2)/3;
        }
        return c;
    }
}
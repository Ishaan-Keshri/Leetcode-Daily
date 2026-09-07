class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        HashMap<Integer,Integer> freqCount=new HashMap<>();

        for(int x:nums)
        {
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        for (HashMap.Entry<Integer, Integer> entry : freq.entrySet()) {
            freqCount.put(entry.getValue(),freqCount.getOrDefault(entry.getValue(),0)+1);
        }
        for(int n:nums)
        {
            int c=freq.get(n);
            if(freqCount.get(c)==1)
            {
                return n;
            }
        }
        return -1;
    }
}
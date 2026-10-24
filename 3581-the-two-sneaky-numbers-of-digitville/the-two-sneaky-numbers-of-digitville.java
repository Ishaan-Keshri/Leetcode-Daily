class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      int a[]=new int[2];
      HashMap<Integer,Integer> mp=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
      }
      int c=0;
      for(Map.Entry<Integer, Integer> entry : mp.entrySet())
      {
        if(entry.getValue()==2)
        {
            a[c++]=entry.getKey();
        }
      }
      return a;  
    }
}
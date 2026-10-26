class Solution {
    public int[] decompressRLElist(int[] nums) {
      ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<nums.length-1;i+=2)
      {
        int r=nums[i];
        while(r--!=0)
        {
            list.add(nums[i+1]);
        }
      } 
      int[] arr = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return arr;
    }
}
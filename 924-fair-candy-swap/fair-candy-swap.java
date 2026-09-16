class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int as=0,bs=0;
        for(int i=0;i<aliceSizes.length;i++)
        {
            as+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++)
        {
            bs+=bobSizes[i];
        }
        int diff = (bs - as) / 2;
        HashSet<Integer> set = new HashSet<>();
        for(int b : bobSizes){
            set.add(b);
        }
        for(int a : aliceSizes){
            int req = a + diff;
            if(set.contains(req)){
                return new int[]{a, req};
            } 
        
        }
        return new int[]{};
    }
}
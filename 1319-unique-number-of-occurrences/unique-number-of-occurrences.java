class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set=new HashSet<>();

        for (Map.Entry<Integer, Integer> l :
             mp.entrySet()) {
                if(!set.contains(l.getValue()))
                {
                    set.add(l.getValue());
                }
                else{
                    return false;
                }
        }
        return true;
    }
}
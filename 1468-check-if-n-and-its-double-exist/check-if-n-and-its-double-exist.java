class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(list.contains(arr[i]*2) || (arr[i]%2==0 && list.contains(arr[i]/2)))
            {
                return true;
            }
            list.add(arr[i]);
        }
        
        return false;
    }
}
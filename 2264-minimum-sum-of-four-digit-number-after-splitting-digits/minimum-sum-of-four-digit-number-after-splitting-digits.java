class Solution {
    public int minimumSum(int num) {
        int arr[]=new  int[4];
        int c=0;
        while(num!=0)
        {
            arr[c++]=num%10;
            num/=10;
        }
        Arrays.sort(arr);
        int ans=((arr[0]*10)+arr[3])+((arr[1]*10)+arr[2]);
        return ans;
    }
}
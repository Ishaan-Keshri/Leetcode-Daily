class Solution {
    public boolean halvesAreAlike(String s) {
        char[] arr=s.toCharArray();
        int start=0,end=arr.length-1;
        int c=0,e=0;
        while(start<=arr.length/2-1)
        {
            if(isVowel(arr[start])==true)
            {
                c++;
            }
            start++;
            if(isVowel(arr[end])==true)
            {
                e++;
            }
            end--;
        }
        return c==e;
    }
    private boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            return true;
        }
        return false;
    }
}
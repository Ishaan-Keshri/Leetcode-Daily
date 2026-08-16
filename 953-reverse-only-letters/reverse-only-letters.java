class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[]=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            if(!Character.isLetter(arr[start]))
            {
                start++;
                continue;
            }
            else if(!Character.isLetter(arr[end]))
            {
                end--;
                continue;
            }
            else
            {
                char ch=arr[start];
                arr[start]=arr[end];
                arr[end]=ch;
                start++;
                end--;
            }
        }
        return String.valueOf(arr);
    }
}
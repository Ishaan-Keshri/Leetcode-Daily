class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String ns="";
        for(String i:arr)
        {
            ns=ns+" "+reverse(i);
        }
        ns=ns.trim();
        return ns;
    }
    private String reverse(String ns)
    {
        char[] arr=ns.toCharArray();
        int start=0,end=arr.length-1;
        while(start<end)
        {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }
}
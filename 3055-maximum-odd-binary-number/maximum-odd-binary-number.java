class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr=s.toCharArray();
        int  c=0;
        for(char ch: arr)
        {
            if(ch=='1')
            {
                c++;
            }
        }
        if(c==1)
        {
            arr[s.indexOf('1')]='0';
            arr[s.length()-1]='1';
        }
        else{
            int i=0;
            while(c!=1)
            {
                arr[i++]='1';
                c--;
            }
            for(;i<arr.length-1;i++)
            {
                arr[i]='0';
            }
            arr[arr.length-1]='1';
        }
        return String.valueOf(arr);
    }
}
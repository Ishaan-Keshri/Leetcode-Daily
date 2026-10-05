class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] ans=new String[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            String ns=arr[i];
            int p=(int)(ns.charAt(ns.length()-1)-'0')-1;
            ans[p]=ns.substring(0,ns.length()-1);
        }
        //return Arrays.toString(ans);
        return String.join(" ", ans);
    }
}
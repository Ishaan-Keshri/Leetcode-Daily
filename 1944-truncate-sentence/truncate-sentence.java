class Solution {
    public String truncateSentence(String s, int k) {
        String arr[]=s.split(" ");
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<k && i<arr.length)
        {
            sb.append(arr[i]+" ");
            i++;
        }
        String ns=String.valueOf(sb);
        ns=ns.trim();
        return ns;
    }
}
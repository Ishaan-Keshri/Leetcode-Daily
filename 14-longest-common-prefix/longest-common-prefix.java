class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String sf=strs[0];
        String sl=strs[strs.length-1];
        while(i<sf.length())
        {
            if(sf.charAt(i)==sl.charAt(i))
            {
                i++;
            }
            else
            {
                break;
            }
        }
        return i==0?"":sf.substring(0,i);
    }
}
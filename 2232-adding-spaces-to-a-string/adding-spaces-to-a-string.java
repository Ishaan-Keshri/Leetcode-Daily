class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int n=spaces.length;
        int idx=0;
        for(int i=0;i<s.length();i++)
        {
           if(idx<n && i==spaces[idx])
           {
                sb.append(' ');
                idx++;
           }
           sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
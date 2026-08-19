class Solution {
    public int reverseDegree(String s) {
        int degree=0;
        for(int i=0;i<s.length();i++)
        {
            int ch=26 - (int)(s.charAt(i)-'a');
            degree+=ch*(i+1);
        }
        return degree;
    }
}
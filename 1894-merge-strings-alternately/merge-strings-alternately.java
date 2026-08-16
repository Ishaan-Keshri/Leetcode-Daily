class Solution {
    public String mergeAlternately(String word1, String word2) {
        char arr[]=new char[word1.length()+word2.length()];
        int i=0,j=0,c=0;
        while(i<word1.length() && j<word2.length())
        {
            arr[c++]=word1.charAt(i++);
            arr[c++]=word2.charAt(j++);
        }
        while(i<word1.length())
        {
            arr[c++]=word1.charAt(i++);
        }
        while(j<word2.length())
        {
            arr[c++]=word2.charAt(j++);
        }
        return String.valueOf(arr);
    }
}
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int sum[]=new int[words.length];
        int c=0;
        for(String s: words)
        {
            int add=0;
            for(char ch:s.toCharArray())
            {
                add+=weights[ch-'a'];
            }
            sum[c++]=add%26;
        }
        StringBuilder sb=new StringBuilder();
        for(int i:sum)
        {
            sb.append((char)('z'-i));
        }
        return String.valueOf(sb);
    }
}
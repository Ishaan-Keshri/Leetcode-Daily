class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int w=0;w<words.length;w++)
        {
            for(int i=0;i<words[w].length();i++)
            {
                if(words[w].charAt(i)==x)
                {
                    ans.add(w);
                    break;
                }
            }
        }
        return ans;
    }
}
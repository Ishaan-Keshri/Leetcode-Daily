class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        while(left<=right)
        {
            if(isVowel(words[left].charAt(0)) && isVowel(words[left].charAt(words[left].length()-1)) )
            {
                c++;
            }
            left++;
        }
        return c;
    }
    private boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            return true;
        }
        return false;
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] f=new int[26];
        for(int i=0;i<magazine.length();i++)
        {
            int ch=(int)(magazine.charAt(i)-'a');
            f[ch]++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            int ch=(int)(ransomNote.charAt(i)-'a');
            if(f[ch]>0)
            {
                f[ch]--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
class Solution {
    public String reverseVowels(String s) {
        char[] ss=s.toCharArray();
        int l=0,r=s.length()-1;
        while(l<r)
        {
            if(!isVowel(ss[l]))
            {
                l++;
            }
            else if(!isVowel(ss[r]))
            {
                r--;
            }
            else{
                char t=ss[l];
            ss[l]=ss[r];
            ss[r]=t;
            l++;
            r--;
            }
            
        }
        return String.valueOf(ss);
    }
    public boolean isVowel(char ch)
    {
        if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                return true;
            }
            return false;
    }
}
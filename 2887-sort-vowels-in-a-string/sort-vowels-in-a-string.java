class Solution {
    public String sortVowels(String s) {
        int n=s.length();
        char t[]=new char[n];
        ArrayList<Character> v=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(isVowel(ch)!=true)
            {
                t[i]=ch;
            }
            else{
                v.add(ch);
            }
        }
        Collections.sort(v);
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(t[i]=='\u0000')
            {
                t[i]=v.get(c++);
            }
        }
        return String.valueOf(t);
    }
    private boolean isVowel(char ch)
    {
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' ||  ch=='i' || ch=='o' || ch=='u' )
        {
            return true;
        }
        return false;
    }
}
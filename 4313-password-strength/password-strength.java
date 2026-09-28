class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set=new HashSet<>();
        int s=0;
        for(int i=0;i<password.length();i++)
        {
            char ch=password.charAt(i);
            if(!set.contains(ch))
            {
                if(ch>='a' && ch<='z')
                {
                    s+=1;
                }
                else if(ch>='A' && ch<='Z')
                {
                    s+=2;
                }
                else if(ch>='0' && ch<='9')
                {
                    s+=3;
                }
                else 
                {
                    s+=5;
                }
                set.add(ch);
            }
        }
        return s;
    }
}
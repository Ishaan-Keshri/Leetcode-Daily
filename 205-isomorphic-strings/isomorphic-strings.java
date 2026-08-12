class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp=new HashMap<Character,Character>();
        if(s.length()!=t.length())
        {
            return false;
        }
        
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(!mp.containsKey(s1))
            {
                if( mp.containsValue(t1))
                {
                    return false;
                }
                mp.put(s1,t1);
            }
            else
            {
                if(!mp.get(s1).equals(t1))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
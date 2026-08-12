class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mp=new HashMap<Character,String>();
        String[] ss=s.split(" ");
        if(ss.length!=pattern.length())
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            if(!mp.containsKey(ch))
            {
                if( mp.containsValue(ss[i]))
                {
                    return false;
                }
                mp.put(ch,ss[i]);
            }
            else
            {
                if(!mp.get(ch).equals(ss[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
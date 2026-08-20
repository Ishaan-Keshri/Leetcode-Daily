class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> ans=new ArrayList<>();
        // for(String i:words)
        // {
        //     String[] s=i.split(""+separator);
        //     for(int j=0;j<s.length;j++)
        //     {
        //         ans.add(s[j]);
        //     }
        //     }
        // }
        for(String s:words)
        {
            int i=0,j=0;
            s=s+""+separator;
            while(j<s.length())
            {
                if(s.charAt(j)!=separator )
                {
                    j++;
                }
                else{
                    if(!s.substring(i,j).equals(""))
                    {
                        ans.add(s.substring(i,j));
                    }
                    i=j+1;
                    j=i;
                }
            }
        }
        return ans;
    }

}
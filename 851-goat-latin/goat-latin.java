class Solution {
    public String toGoatLatin(String sentence) {
        String[] s=sentence.split(" ");
        String ns="",lt="a";
        for(int i=0;i<s.length;i++)
        {
            char ch=s[i].charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U')
            {
                ns=ns+s[i]+"ma";
            }
            else
            {
                ns=ns+s[i].substring(1,s[i].length())+ch+"ma";
            }
            ns=ns+lt+" ";
            lt=lt+"a";
        }
        ns=ns.trim();
        return ns;
    }
}
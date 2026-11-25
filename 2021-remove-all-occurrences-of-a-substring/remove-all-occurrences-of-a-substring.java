class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
        int p=sb.indexOf(part);
            sb.delete(p,p+part.length());
        }
        return sb.toString();
    }
}
class Solution {
    public boolean canAliceWin(int n) {
       int c=10;
       boolean alwin=true;
       while(n>=c)
       {
        n-=c;
        alwin=!alwin;
        c--;
       }
       return !alwin;
    }
}
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] s=startTime.split(":");
        String[] e=endTime.split(":");
        int  h=Integer.parseInt(e[0])-Integer.parseInt(s[0]);
        int m=Integer.parseInt(e[1])-Integer.parseInt(s[1]);
        int se=Integer.parseInt(e[2])-Integer.parseInt(s[2]);

        return h*60*60+m*60+se;
    }
}
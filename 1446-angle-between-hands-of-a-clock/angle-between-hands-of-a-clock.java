class Solution {
    public double angleClock(int hour, int minutes) {
     double minAngle=minutes*6;
     double  hrAngle=(hour%12)*30+(minutes*0.5);
     double  diff=Math.abs(hrAngle-minAngle);
      return Math.min(diff,360-diff);
    }
}
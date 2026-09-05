class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double sum=0;
        for(int i=0;i<salary.length;i++)
        {
            sum+=salary[i];
            if(min>salary[i])
            {
                min=salary[i];
            }
            if(max<salary[i])
            {
                max=salary[i];
            }
        }
        sum=sum-min-max;
        return sum/(salary.length-2);
    }
}
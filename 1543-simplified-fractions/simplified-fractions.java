class Solution {
    public List<String> simplifiedFractions(int n) {
        ArrayList<String> ans=new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                if(gcd(j,i)==1)
                {
                    ans.add(j+"/"+i);
                }
            }
        }
        return ans;
    }
    public int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;

            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0 ; i<= n ; i++)
        {
            ans[i] = count(i);
        }
        return ans;
    }
    
    private int count(int n)
    {
        int c = 0;
        for(int j=0 ; j<=30; j++)
        {
            if((n&(1<<(j)))!=0)
            {
                c++;
            }
        }
        return c;
    }
}
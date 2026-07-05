class Solution {
    public int arrangeCoins(int n) 
    {
        int i=1,k=0;
       while(n>=i)
       {
        n=n-i;
        i++;
        k++;
       }
        return k;
    }
}
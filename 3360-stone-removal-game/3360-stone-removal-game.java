class Solution {
    public boolean canAliceWin(int n) 
    {
        boolean curr=false;
        int j=10;
        while(n>=j)
        {
            n-=j;
            curr=!curr;
            j--;
        }
        return curr;


        
    }
}
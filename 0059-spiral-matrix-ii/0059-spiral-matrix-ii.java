class Solution {
    public int[][] generateMatrix(int n)
     {
        int curr=0;
        int ans[][]=new int[n][n];
        boolean v[][]=new boolean[n][n];
        int top=0,left=0,bottom=n-1,right=n-1;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                if(!v[top][i])
                {
                ans[top][i]=++curr;
                v[top][i]=true;
                }
            }
            for(int i=top;i<=bottom;i++)
            {
                if(!v[i][right])
                {
                    ans[i][right]=++curr;
                    v[i][right]=true;
                }
            }
            for(int i=right;i>=left;i--)
            {
                if(!v[bottom][i])
                {
                    ans[bottom][i]=++curr;
                    v[bottom][i]=true;
                }
            }
            for(int i=bottom;i>=top;i--)
            {
                if(!v[i][left])
                {
                    ans[i][left]=++curr;
                    v[i][left]=true;
                }
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        return ans;
        
    }
}
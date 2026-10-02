class Solution {
    public int[][] generateMatrix(int n)
     {
        int curr=0;
        int ans[][]=new int[n][n];
        for(int c[]:ans)
        Arrays.fill(c,-1);
        int top=0,left=0,bottom=n-1,right=n-1;
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                if(ans[top][i]==-1)
                {
                ans[top][i]=++curr;
                }
            }
            for(int i=top;i<=bottom;i++)
            {
                if(ans[i][right]==-1)
                {
                    ans[i][right]=++curr;
                    
                }
            }
            for(int i=right;i>=left;i--)
            {
                if(ans[bottom][i]==-1)
                {
                    ans[bottom][i]=++curr;
                    
                }
            }
            for(int i=bottom;i>=top;i--)
            {
                if(ans[i][left]==-1)
                {
                    ans[i][left]=++curr;
                    
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
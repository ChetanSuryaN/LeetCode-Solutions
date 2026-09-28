class Solution {
    public int[][] updateMatrix(int[][] mat)
     {
        int m=mat.length;
        int n=mat[0].length;
        int [][]ans=new int[m][n];
        
        Queue<int []> queue=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    ans[i][j]=0;
                    queue.add(new int[]{i,j});
                }
                else
                {
                    ans[i][j]=Integer.MAX_VALUE;
                    
                }
            }
        }
        int arr[][]={{-1,0},{1,0},{0,-1},{0,1}};
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                int c[]=queue.poll();
                for(int nums[]:arr)
                {
                    int row=c[0]+nums[0];
                    int col=c[1]+nums[1];
                    if(row>=0&&row<m&&col>=0&&col<n)
                    {
                        if(ans[row][col]>ans[c[0]][c[1]]+1)
                        {
                           ans[row][col]=ans[c[0]][c[1]]+1;
                            queue.add(new int[]{row,col});    
                        }                    
                    }
                }

            }
        }
        return ans;
        
    }
}
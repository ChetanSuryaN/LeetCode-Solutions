class Solution {
    public int[][] highestPeak(int[][] isWater) 
    {
        int m=isWater.length;
        int n=isWater[0].length;
        Queue<int []> queue=new LinkedList<>();
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isWater[i][j]==1)
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
                int k[]=queue.poll();
                for(int c[]:arr)
                {
                    int row=k[0]+c[0];
                    int col=k[1]+c[1];
                    if(row>=0&&row<m&&col>=0&&col<n)
                    {
                        if(ans[row][col]>ans[k[0]][k[1]]+1)
                        {
                            ans[row][col]=ans[k[0]][k[1]]+1;
                            queue.add(new int[]{row,col});
                        }
                    }
                }
            }
        }
        return ans;       
    }
}
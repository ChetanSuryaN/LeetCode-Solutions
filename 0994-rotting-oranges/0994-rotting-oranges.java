class Solution 
{
    int ans=0;
    public int orangesRotting(int[][] grid) 
    {
        int freshOrange=0;
        Queue<int []> queue=new LinkedList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    queue.add(new int[]{i,j});
                }
                else if(grid[i][j]==1)
                {
                    freshOrange++;
                }
            }
        }
        int minutes=0;
        int arr[][]={{-1,0},{1,0},{0,-1},{0,1}};
        while(!queue.isEmpty()&&freshOrange>0)
        {
            int size=queue.size();
            for(int i=0;i<size;i++)
            {
                int curr[]=queue.poll();
                for(int row[]:arr)
                {
                    int nrow=curr[0]+row[0];
                    int ncol=curr[1]+row[1];
                    if(nrow>=0&&ncol>=0&&nrow<grid.length&&ncol<grid[0].length)
                    {
                        if(grid[nrow][ncol]==1)
                        {
                            grid[nrow][ncol]=2;
                            freshOrange--;
                            queue.add(new int[]{nrow,ncol});
                        }
                    }
                }

            }
            minutes++;
        }
        return freshOrange==0?minutes:-1;
    }
}
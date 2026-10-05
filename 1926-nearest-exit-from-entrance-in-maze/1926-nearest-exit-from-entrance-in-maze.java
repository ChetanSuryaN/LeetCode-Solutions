class Solution 
{
    //use BFS Dammit bcz to find distance bfs is more suitable not dfs
   
    public int nearestExit(char[][] maze, int[] entrance) 
    {
     Queue<int []> queue=new LinkedList<>(); 
     int m=maze.length;
     int n=maze[0].length;
     maze[entrance[0]][entrance[1]]='+';
     queue.add(new int[]{entrance[0],entrance[1]});
     int ans=1;
     int arr[][]={{-1,0},{1,0},{0,-1},{0,1}};
     while(!queue.isEmpty())
     {
        int size=queue.size();
        for(int i=0;i<size;i++)
        {
            int k[]=queue.poll();
            for(int c[]:arr)
            {
                int row=c[0]+k[0];
                int col=c[1]+k[1];
                if(row>=0&&row<m&&col>=0&&col<n)
                {
                    if(row==0||row==m-1||col==0||col==n-1)
                    {
                        if(maze[row][col]=='.')
                        {
                            return ans;
                        }
                    }
                    else if(maze[row][col]=='.')
                    {
                        queue.add(new int[]{row,col});
                        maze[row][col]='+';
                    }
                    
                }
            }
        }
        ans++;
     } 
     return -1; 
      
    }
}
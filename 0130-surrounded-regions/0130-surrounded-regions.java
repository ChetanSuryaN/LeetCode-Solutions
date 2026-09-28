class Solution {
    public void solve(char[][] board) 
    {
        Queue<int []> queue=new LinkedList<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(j==0||j==board[0].length-1||i==0||i==board.length-1)
                {
                    if(board[i][j]=='O')
                    {
                        queue.add(new int[]{i,j});
                        board[i][j]='E';
                    }
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
                int row=c[0]+k[0];
                int col=c[1]+k[1];
                if(row>=0&&row<board.length&&col>=0&&col<board[0].length)
                {
                    if(board[row][col]=='O')
                    {
                        board[row][col]='E';
                        queue.add(new int[]{row,col});
                    }
                }
            }
        }
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='E')
                {
                    board[i][j]='O';
                }
                else
                {
                    board[i][j]='X';
                }
            }
        }      
    }
    
}
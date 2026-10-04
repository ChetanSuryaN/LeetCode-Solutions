class Solution {
    public void gameOfLife(int[][] board) 
    {
        int co[][]={{1,0},{-1,0},{0,-1},{0,1},{1,1},{1,-1},{-1,1},{-1,-1}};
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                
                int count=0;
                for(int c[]:co)
                {
                    int row=c[0]+i;
                    int col=c[1]+j;
                    count+=check(board,row,col);
                }
                if((count<2||count>3)&&board[i][j]==1)
                {
                    board[i][j]=2;
                }
                else if(count==3&&board[i][j]==0)
                {
                    board[i][j]=3;
                }
            }
        }  
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==2)
                {
                    board[i][j]=0;
                }
                if(board[i][j]==3)
                {
                    board[i][j]=1;
                }
            }
        }      
    }
    private int check(int[][] board,int i,int j)
    {
        if(i<0||i>=board.length||j<0||j>=board[0].length)
        {
            return 0;
        }
        else if(board[i][j]==2||board[i][j]==1)
        {
            return 1;
        }
        return 0;
    }
}
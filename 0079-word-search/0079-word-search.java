class Solution {
    public boolean exist(char[][] board, String word) 
    {
        boolean visited[][]=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(found(board,i,j,word,0,visited))
                    {
                        return true;
                    }
                }
            }
            
        } 
        return false;       
    }
    public boolean found(char board[][],int i,int j,String word,int pos,boolean visited[][])
    {
        if(i<0||j<0||i>=board.length||j>=board[0].length||pos>=word.length())
        {
            return false;
        }
        if(visited[i][j])
        {
            return false;
        }
        
        if(word.charAt(pos)==board[i][j])
        {
            if(pos==word.length()-1)
            {
                return true;
            }
            visited[i][j]=true;
            //boolean up=;
           // boolean down=;
            //boolean right=;
            //boolean left=;
            boolean status=found(board,i-1,j,word,pos+1,visited)||found(board,i+1,j,word,pos+1,visited)||found(board,i,j-1,word,pos+1,visited)||found(board,i,j+1,word,pos+1,visited);
            if(!status)
            {
                visited[i][j]=false;
                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}
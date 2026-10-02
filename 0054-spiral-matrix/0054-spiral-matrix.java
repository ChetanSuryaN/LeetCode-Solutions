class Solution 
{
    List<Integer> list=new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix)
    {    
        boolean visited[][]=new boolean[matrix.length][matrix[0].length];
        int startrow=0,endrow=matrix.length-1,startcol=0,endcol=matrix[0].length-1;
        while(startrow<=endrow&&startcol<=endcol)
        {
            for(int i=startcol;i<=endcol;i++)
            {
                if(!visited[startrow][i])
                {
                list.add(matrix[startrow][i]);
                visited[startrow][i]=true;
                }
            }
            
            for(int i=startrow+1;i<=endrow;i++)
            {
                if(!visited[i][endcol])
                {
                list.add(matrix[i][endcol]);
                visited[i][endcol]=true;
                }

            }
           
            for(int i=endcol-1;i>=startcol;i--)
            {
                if(!visited[endrow][i])
                {
                list.add(matrix[endrow][i]);
                visited[endrow][i]=true;
                }
            }

             
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(!visited[i][startcol])
                {
                list.add(matrix[i][startcol]);
                visited[i][startcol]=true;
                }
            }
            startrow++;
            endrow--;
             startcol++;
            endcol--;
        }    
        return list;
    }
    
}
class Solution 
{
    List<Integer> list=new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix)
    {    
       
        int startrow=0,endrow=matrix.length-1,startcol=0,endcol=matrix[0].length-1;
        while(startrow<=endrow&&startcol<=endcol)
        {
            for(int i=startcol;i<=endcol;i++)
            {
                if(matrix[startrow][i]!=101)
                {
                list.add(matrix[startrow][i]);
                matrix[startrow][i]=101;
                
                }
            }
            
            for(int i=startrow+1;i<=endrow;i++)
            {
                if(matrix[i][endcol]!=101)
                {
                list.add(matrix[i][endcol]);
                matrix[i][endcol]=101;
                }

            }
           
            for(int i=endcol-1;i>=startcol;i--)
            {
                if(matrix[endrow][i]!=101)
                {
                list.add(matrix[endrow][i]);
                matrix[endrow][i]=101;
                }
            }

             
            for(int i=endrow-1;i>=startrow+1;i--)
            {
                if(matrix[i][startcol]!=101)
                {
                list.add(matrix[i][startcol]);
                matrix[i][startcol]=101;
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
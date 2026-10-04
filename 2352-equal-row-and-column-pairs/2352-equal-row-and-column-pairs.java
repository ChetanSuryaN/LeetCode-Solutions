class Solution {
    public int equalPairs(int[][] grid) 
    {
        HashMap<List<Integer>,Integer> row=new HashMap<>();
        
        for(int i=0;i<grid.length;i++)
        {
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++)
            {
                list.add(grid[i][j]);
            }
            row.put(list,row.getOrDefault(list,0)+1);
        }
        int ans=0;
        for(int j=0;j<grid[0].length;j++)
        {
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<grid.length;i++)
            {
                list.add(grid[i][j]);
            }
            ans+=row.getOrDefault(list,0);
        }
        return ans;

        
    }
}
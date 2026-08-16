class Solution {
    public int nearestDrone(int[][] drones, int[] target) 
    {
        int min=Integer.MAX_VALUE;
        int minpos=-1;
        for(int i=0;i<drones.length;i++)
            {
                int diff=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);

                if(diff<min && diff<=drones[i][2])
                {
                    min=diff;
                    minpos=i;
                }
            }
        return minpos;
        
    }
}
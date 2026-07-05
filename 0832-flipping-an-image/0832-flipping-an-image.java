class Solution {
    public int[][] flipAndInvertImage(int[][] image) 
    {
        
        int n=image.length;
        for(int i=0;i<n;i++)
        {
            int left=0,right=image[0].length-1;
            while(left<=right)
            {
                int t=image[i][left];
                image[i][left]=Math.abs(image[i][right]-1);
                image[i][right]=Math.abs(t-1);
                left++;
                right--;

            }
        }
        
        return image;
        
    }
}
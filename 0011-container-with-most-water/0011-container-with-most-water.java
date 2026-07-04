class Solution {
    public int maxArea(int[] height) 
    {
        int left=0,n,right,max=0,imp=0;
        n=height.length;
        right=n-1;
        while (right>left)
        {
            imp=Math.min(height[left],height[right]);
            max=Math.max(imp*(right-left),max);
            if(height[right]>height[left])
            {
                left++;
            }
            else
            right--;

        }
        return max;

        
    }
}
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        int count=0;
        for(int num:arr1)
        {
            if(isValid(num,arr2,d)) count++;
        }
        return count;        
    }
    private boolean isValid(int num,int arr[],int d)
    {
        for(int a:arr)
        {
            if(Math.abs(num-a)<=d) return false;
        }
        return true;
    }

}
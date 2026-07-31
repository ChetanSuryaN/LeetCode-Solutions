class Solution {
    public int calPoints(String[] operations)
    {     
        int arr[]=new int[1000];
        int top=-1;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("C"))
            {
                top--;
            }
            else if(operations[i].equals("D"))
            {
                arr[++top]=2*arr[top-1];
            }
            else if(operations[i].equals("+"))
            {
                int a=arr[top];
                top--;
                int sum=arr[top]+a;
                arr[++top]=a;
                arr[++top]=sum;
            }
            else
            {
                arr[++top]=Integer.valueOf(operations[i]);
            }
        }  
        int ans=0;
        for(int i=0;i<=top;i++)
        {
            ans+=arr[i];
        }
        return ans;
    }
}
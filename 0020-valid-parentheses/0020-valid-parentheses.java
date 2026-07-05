class Solution {
    public boolean isValid(String s)
     {
        int n=s.length();
        if(n%2==1)
        return false;
        int top=-1;
         int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
            {
                arr[++top]=s.charAt(i);

            }
            if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')')
            {
                if(top==-1)
                return false;

                if(s.charAt(i)=='}'&&arr[top]!='{')
                {
                    return false;
                    
                }
                if(s.charAt(i)==']'&&arr[top]!='[')
                {
                    return false;
                    
                }
                if(s.charAt(i)==')'&&arr[top]!='(')
                {
                    return false;
                   
                }
                top--;
            }
        } 
        if(top!=-1)
        return false;
        
        return true;      
    }
}
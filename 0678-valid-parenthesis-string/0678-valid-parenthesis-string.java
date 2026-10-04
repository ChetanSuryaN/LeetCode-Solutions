class Solution {
    public boolean checkValidString(String s) 
    {
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st1.push(i);
            }
            if(s.charAt(i)=='*')
            {
                st2.push(i);
            }
            if(s.charAt(i)==')')
            {
                if(st1.isEmpty())
                {
                    if(st2.isEmpty())
                    {
                        return false;
                    }
                    else
                    {
                        st2.pop();
                    }
                }
                else
            {
                st1.pop();
            }
            }
            
        }
        while(!st1.isEmpty())
        {
            if(!st2.isEmpty())
            {
                if(st1.peek()<st2.peek())
                {
                    st1.pop();
                    st2.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;

        
    }
}
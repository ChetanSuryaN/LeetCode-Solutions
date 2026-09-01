class Solution {
    public int calculate(String s)
    {
    Stack<Integer> st=new Stack<>();
    int i=0;    
    char PreviousOperator='+';
    while(i<s.length())
    {
        if(s.charAt(i)==' ')
        {
            i++;
        }
        else if(Character.isDigit(s.charAt(i)))
        {  
            long a=0;      
        while(i<s.length()&&Character.isDigit(s.charAt(i)))
        {
            a=a*10+s.charAt(i)-'0';
            i++;
        }
        i--;
        if(PreviousOperator=='+')       
        {
            st.push((int)a);
        }
        else if(PreviousOperator=='-')
        {
            
            st.push(-(int)a);
        }
        else if(PreviousOperator=='*')
        {
            int c=st.pop();
            
            st.push(c*(int)a);
        }
        else if(PreviousOperator=='/')
        {
            int c=st.pop();           
            st.push(c/(int)a);
        }
        i++;
        }
        else
        {
            PreviousOperator=s.charAt(i);
            i++;
        }
        
        
    }
    long ans=0;
    while(!st.isEmpty())
    {
        ans+=st.pop();
    }
    return (int)ans;
        
    }
   
}
class Solution {
    public int nextGreaterElement(int n) 
    {
        if(n>=Integer.MAX_VALUE)
        return -1;
        int x=-1;
        String s=String.valueOf(n);
        int right=s.length()-2;
        while(right>=0)
        {
            if(s.charAt(right)-'0'<s.charAt(right+1)-'0')
            {
               return swap(s.charAt(right)-'0',right,s);
                
               
            }
            right--;
        }
       
        return -1;


        
    }
    public int swap(int value,int position,String s)
    {
        char []c=s.toCharArray();
        for(int i=s.length()-1;i>position;i--)
        {
            if(c[i]-'0'>value)
            {
               char temp=c[i];
               c[i]=c[position];
               c[position]=temp;
               break;
            }
        }

        int left=position+1;
        int right=s.length()-1;
        while(left<right)
        {
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        s=new String(c);
        long l=Long.valueOf(s);
        if(l>Integer.MAX_VALUE)
        {
            return -1;
        }
        return (int)l ;
    }
   

    }

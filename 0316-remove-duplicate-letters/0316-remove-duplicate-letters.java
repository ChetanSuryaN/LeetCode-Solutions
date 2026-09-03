class Solution {
    public String removeDuplicateLetters(String s) 
    {
        int lastindex[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            lastindex[s.charAt(i)-'a']=i;
        }
        boolean visited[]=new boolean[26];
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!visited[s.charAt(i)-'a'])
            {
            if(stack.isEmpty())
            {
                stack.push(s.charAt(i));
            }
            else 
            {
                while(!stack.isEmpty())
                {
                    if(stack.peek()>s.charAt(i)&&lastindex[stack.peek()-'a']>i)
                    {
                        visited[stack.peek()-'a']=false;
                        stack.pop();
                    }
                    else 
                    {
                        break;
                    }
                }
                stack.push(s.charAt(i));
            }
            visited[s.charAt(i)-'a']=true;
        }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        String ans= new String(sb.reverse());
        return ans;
        
    }
}
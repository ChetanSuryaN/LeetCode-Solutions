class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            
                if(asteroids[i]<0)
                {
                    if(stack.isEmpty()||stack.peek()<0)
                    {
                        stack.push(asteroids[i]);
                    }
                    else 
                    {
                        while(!stack.isEmpty()&&stack.peek()>0&&stack.peek()<-asteroids[i])
                        {
                            stack.pop();
                        }
                        
                        if(stack.isEmpty()||stack.peek()<-asteroids[i]) 
                        {
                            stack.push(asteroids[i]);
                        }
                        if(!stack.isEmpty()&&stack.peek()==-asteroids[i])
                        {
                            stack.pop();
                        }
                    }
                }
                else
                {
                    stack.push(asteroids[i]);
                }
                         
            
        }
        int ans[]=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--)
        {
            ans[i]=stack.pop();
        }
        return ans;        
    }
}
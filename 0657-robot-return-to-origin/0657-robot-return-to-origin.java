class Solution {
    public boolean judgeCircle(String moves)
     {
        int i,x=0,y=0,n;
        char c;
        n=moves.length();
        for(i=0;i<n;i++)
        {
            c=moves.charAt(i);
            if(c=='L')
            {
                y--;
            }
            else if(c=='U')
            {
                x++;
            }
            else if(c=='R')
            {
                y++;
            }
            else
            x--;

        }
        if(x==0&&y==0)
        {
            return true;
        }
        return false;

    }
}
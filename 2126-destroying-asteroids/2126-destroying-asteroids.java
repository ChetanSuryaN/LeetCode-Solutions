class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
        Arrays.sort(asteroids);
        long amass=mass;
        for(int a:asteroids)
        {
            if(a>amass)
            {
                return false;
            }
            else
            {
               amass=a+amass;
            }
        }
        return true;
        
    }
}
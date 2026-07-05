class Solution {
    public int distributeCandies(int[] candyType)
     {
        HashSet<Integer>  set=new HashSet<>();
        for(int i=0;i<candyType.length;i++)
        {
            set.add(candyType[i]);
        }
        int x=candyType.length;
        if(set.size()>=x/2)
        {
            return x/2;
        }
        else
        return set.size();
        
    }
}
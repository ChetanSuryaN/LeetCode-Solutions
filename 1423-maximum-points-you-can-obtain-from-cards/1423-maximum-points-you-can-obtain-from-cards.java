class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
        
        int sum=0,totalsum=0;
        for(int i=0;i<cardPoints.length-k;i++)
        {
            totalsum+=cardPoints[i]; 
            sum+=cardPoints[i];            
        }
        int ans=sum;
        for(int i=cardPoints.length-k;i<cardPoints.length;i++)
        {
            sum-=cardPoints[i-cardPoints.length+k];
            sum+=cardPoints[i];
            totalsum+=cardPoints[i];
            ans=Math.min(ans,sum);
        }
        return totalsum-ans;
        
    }
}
public class Solution {
    public int totalNumbers(int[] digits) {
        int[] availableCounts = new int[10];
        for (int digit : digits) {
            availableCounts[digit]++;
        }
        
        int uniqueEvenCount = 0;
        
        for (int num = 100; num <= 998; num += 2) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int ones = num % 10;
            
            int[] neededCounts = new int[10];
            neededCounts[hundreds]++;
            neededCounts[tens]++;
            neededCounts[ones]++;
            
            boolean isValid = true;
            for (int i = 0; i < 10; i++) {
                if (availableCounts[i] < neededCounts[i]) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                uniqueEvenCount++;
            }
        }
        
        return uniqueEvenCount;
    }
}
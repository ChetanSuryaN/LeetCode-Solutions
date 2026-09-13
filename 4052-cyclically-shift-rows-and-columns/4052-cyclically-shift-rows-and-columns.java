class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] rowShifted = new int[n][n];

        for (int r = 0; r < n; r++) {
            int shift = rowShift[r] % n;
            for (int c = 0; c < n; c++) {
                int targetCol = (c - shift + n) % n;
                rowShifted[r][targetCol] = grid[r][c];
            }
        }

        int[][] result = new int[n][n];

        for (int c = 0; c < n; c++) {
            int shift = colShift[c] % n;
            for (int r = 0; r < n; r++) {
                int targetRow = (r - shift + n) % n;
                result[targetRow][c] = rowShifted[r][c];
            }
        }

        return result;
    }
}
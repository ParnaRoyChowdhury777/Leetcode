class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length * grid.length;
        long sumN = ((long)n * (n + 1)) / 2;
        long sum2N = ((long)n * (n + 1) * (2*n + 1)) / 6;

        long sum = 0, sum2 = 0;

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid.length; j++) {
                sum += grid[i][j];
                sum2 += grid[i][j] * grid[i][j];
            }
        }

        long x = sumN - sum;
        long y = (sum2N - sum2) / x;
        long b = (x + y) / 2;
        long a = b - x;

        return new int[]{(int)a, (int)b};
    }
}
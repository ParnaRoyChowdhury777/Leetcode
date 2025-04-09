class Solution {

    public int countOnes(int[][] mat, int row) {
        int n = mat[0].length;
        int count = 0;

        for(int i=0; i<n; i++) {
            if(mat[row][i] == 1) {
                count++;
            }
        }

        return count;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ansRow = 0, max = Integer.MIN_VALUE;

        for(int i=0; i<m; i++) {
            int cnt = countOnes(mat, i);
            if(cnt > max) {
                max = cnt;
                ansRow = i;
            }
        }

        return new int[]{ansRow, max};
    }
}
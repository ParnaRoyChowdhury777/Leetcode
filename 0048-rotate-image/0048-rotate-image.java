class Solution {

    void reverse(int[][] matrix, int i) {
        int start = 0, end = matrix.length - 1;
        while(start <= end) {
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++) {
            reverse(matrix, i);
        }
    }
}
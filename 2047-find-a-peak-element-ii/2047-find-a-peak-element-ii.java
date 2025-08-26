class Solution {
    public int max(int[][] mat, int col) {
        int m = mat.length, n = mat[0].length;
        int maxElement = -1;
        int ind = 0;
        for(int i=0; i<m; i++) {
            if(mat[i][col] > maxElement) {
                maxElement = mat[i][col];
                ind = i;
            }
        }
        return ind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            int max_ind = max(mat, mid);
            int left = (mid - 1) >= 0 ? mat[max_ind][mid - 1] : -1;
            int right = (mid + 1) < n ? mat[max_ind][mid + 1] : -1;

            if(mat[max_ind][mid] > left && mat[max_ind][mid] > right) {
                return new int[]{max_ind, mid};
            }
            else if(mat[max_ind][mid] < left) high = mid - 1;
            else low = mid + 1;
        }
        return new int[]{-1, -1};
    }
}
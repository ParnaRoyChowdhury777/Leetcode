class Solution {
    public double trimMean(int[] arr) {
        int n = (int)(0.05*arr.length);
        int start = 0, end = arr.length;
        for(int i=1; i<=n; i++) {
            Arrays.sort(arr, start, end);
            start++;
            end--;
        }

        double sum = 0;
        for(int i=start; i<end; i++) {
            sum += arr[i];
        }

        return sum/(end - start);
    }
}
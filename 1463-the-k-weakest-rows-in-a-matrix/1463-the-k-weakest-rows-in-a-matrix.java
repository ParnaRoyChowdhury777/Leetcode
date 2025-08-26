class Solution {
    public static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public int countOnes(int[] nums) {
        int low = 0, high = nums.length - 1, ans = nums.length;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] == 0) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        int m = mat.length, n = mat[0].length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.second == b.second ? Integer.compare(a.first, b.first) : Integer.compare(a.second, b.second));
        for(int i=0; i<m; i++) {
            int ones = countOnes(mat[i]);
            pq.add(new Pair(i, ones));
        }

        for(int i=0; i<k; i++) {
            ans[i] = pq.poll().first;
        }

        return ans;
    }
}
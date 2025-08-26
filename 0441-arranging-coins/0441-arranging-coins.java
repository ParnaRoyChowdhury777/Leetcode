class Solution {
    public int arrangeCoins(int n) {
        int low = 1, high = n, ans = 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            long cnt = (long)mid*(mid + 1) / 2;
            if(cnt > n) high = mid - 1;
            else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}
class Solution {
    public boolean possible(int arr[], int mid, int m, int k) {
        int cnt=0, noOfDays=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= mid) cnt++;
            else {
                noOfDays += cnt/k;
                cnt = 0;
            }
        }
        noOfDays += cnt/k;
        if(noOfDays >= m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < m*k) return -1;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0; i<bloomDay.length; i++) {
            if(bloomDay[i] < min) {
                min = bloomDay[i];
            }
            if(bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }

        int low = min, high = max, ans=-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(possible(bloomDay, mid, m, k) == true) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
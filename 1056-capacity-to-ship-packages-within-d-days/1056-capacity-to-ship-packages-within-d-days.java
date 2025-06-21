class Solution {
    public int daysReq(int[] weights, int mid) {
        int load = 0, day = 1;
        for(int i=0; i<weights.length; i++) {
            if(weights[i] + load > mid) {
                day++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
       int low = Integer.MIN_VALUE, high = 0; 
       for(int i=0; i<weights.length; i++) {
        high += weights[i];
        if(weights[i] > low) {
            low = weights[i];
        }
       }

       while(low <= high) {
        int mid = low + (high - low) / 2;
        if(daysReq(weights, mid) <= days) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
       }

       return low;
    }
}
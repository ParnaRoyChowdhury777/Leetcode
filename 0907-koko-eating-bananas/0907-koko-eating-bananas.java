class Solution {
    public int func(int[] piles, int mid) {
        int totalhrs = 0;
        for(int i=0; i<piles.length; i++) {
            totalhrs += Math.ceil((double)piles[i] / (double)mid);
        }
        return totalhrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high=Integer.MIN_VALUE;
        for(int i=0; i<piles.length; i++) {
            if(piles[i] > high) {
                high = piles[i];
            }
        }
        int low = 1, ans=Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int totalhrs = func(piles, mid);
            if(totalhrs <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
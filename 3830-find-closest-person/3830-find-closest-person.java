class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z-x) < Math.abs(z-y)) {
            return 1;
        } else if(Math.abs(z-x) > Math.abs(z-y)) {
            return 2;
        } else {
            return 0;
        }
    }
}
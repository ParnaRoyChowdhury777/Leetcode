class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0], y0 = coordinates[0][1], x1 = coordinates[1][0], y1 = coordinates[1][1];
        for(int i=2; i<coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if((y1 - y0) * (x - x0) != (y - y0)*(x1 - x0)) {
                return false;
            }
        }
        return true;
    }
}
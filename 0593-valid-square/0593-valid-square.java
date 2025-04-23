import java.util.Collection;

class Solution {

    public int findDist(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return dx*dx + dy*dy;
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = {p1, p2, p3, p4};
        List<Integer> distances = new ArrayList<>();

        for(int i=0; i<points.length; i++) {
            for(int j=i+1; j<points.length; j++) {
                int dist = findDist(points[i], points[j]);
                if(dist == 0) {
                    return false;
                }
                distances.add(dist);
            }
        }

        Map<Integer, Integer> mpp = new HashMap<>();
        for(int d: distances) {
            mpp.put(d, mpp.getOrDefault(d, 0)+1);
        }

        if(mpp.size() != 2) {
            return false;
        }

        Collection<Integer> values = mpp.values();
        return values.contains(4) && values.contains(2);
    }
}
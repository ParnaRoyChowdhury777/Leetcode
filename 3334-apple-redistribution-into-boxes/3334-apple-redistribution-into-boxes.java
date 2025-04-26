class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sumApples = 0;
        for(int i=0; i<apple.length; i++) {
            sumApples += apple[i];
        }

        Arrays.sort(capacity);
        int capacitySum = 0, count = 0;

        for(int i=capacity.length - 1; i>=0; i--) {
            capacitySum += capacity[i];
            count += 1;
            if(capacitySum >= sumApples) {
                break;
            }
        }

        return count;
    }
}
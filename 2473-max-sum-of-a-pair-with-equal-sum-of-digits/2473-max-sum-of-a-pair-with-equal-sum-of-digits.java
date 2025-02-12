class Solution {
    public int count(int n) {
        int sum = 0;
        while(n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int maxSum = -1;
        for(int num : nums) {
            int sumDigits = count(num);
            if(sumMap.containsKey(sumDigits)) {
               int pairSum = num + sumMap.get(sumDigits);
               maxSum = Math.max(maxSum, pairSum);
               sumMap.put(sumDigits, Math.max(num, sumMap.get(sumDigits)));
            } else {
                sumMap.put(sumDigits, num);
            }
        }
        return maxSum;
    }
}
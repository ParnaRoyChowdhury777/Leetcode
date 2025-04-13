class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int res[] = new int[2];
        int j = 0;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: mpp.entrySet()) {
            if(entry.getValue() == 2) {
                res[j++] = entry.getKey();
                if(j == 2) break;
            }
        }

        return res;
    }
}
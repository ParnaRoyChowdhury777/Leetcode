class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int a = nums[i];
            int more = target - a;
            if(mpp.containsKey(more)) {
                return new int[]{mpp.get(more), i};
            }
            mpp.put(a, i);
        }
        return new int[]{-1,-1};
    }
}
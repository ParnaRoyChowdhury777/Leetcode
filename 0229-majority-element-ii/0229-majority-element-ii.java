class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i++) {
            if(cnt1 == 0 && nums[i] != el2) {
                cnt1 = 1;
                el1 = nums[i];
            } else if(cnt2 == 0 && nums[i] != el1) {
                cnt2 = 1;
                el2 = nums[i];
            } else if(nums[i] == el1) {
                cnt1++;
            } else if(nums[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        int count1 = 0, count2 = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == el1) {
                count1++;
            } else if(nums[i] == el2) {
                count2++;
            }
        }

        int k = nums.length / 3;

        if(count1 > k) {
            ans.add(el1);
        }

        if(count2 > k) {
            ans.add(el2);
        }

        return ans;
    }
}
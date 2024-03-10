class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        x = []
        y = []
        ans = []
        for i in nums1:
            if i not in nums2:
                x.append(i)
        x = list(set(x))
        for j in nums2:
            if j not in nums1:
                y.append(j)
        y = list(set(y))
        ans.append(x)
        ans.append(y)
        return ans
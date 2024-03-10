class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        dict1 = {}
        dict2 = {}
        res = []
        for i in nums1:
            dict1[i] = nums1.count(i)
        for i in nums2:
            dict2[i] = nums2.count(i)
        for key in list(dict1.keys()):
            if key in list(dict2.keys()):
                x = min(dict1[key], dict2[key])
                for i in range(x):
                    res.append(key)
        return res
        
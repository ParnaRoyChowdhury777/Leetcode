class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        list=[]
        nums1=[*set(nums1)]
        nums2=[*set(nums2)]
        for i in nums1:
            for j in nums2:
                if i==j:
                    list.append(i)
        return list
        
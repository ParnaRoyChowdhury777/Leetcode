class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        counts = collections.Counter(nums)
        rows = max(counts.values())
        result = [[] for _ in range(rows)]
        
        for num, count in counts.items():
            for i in range(count):
                result[i].append(num)
        return result
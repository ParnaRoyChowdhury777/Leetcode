class Solution:
    def minOperations(self, nums: List[int]) -> int:
        counts = collections.Counter(nums)
        cnt = 0
        for a in counts.values():
            if a == 1:
                return -1
            else:
                    cnt+=(a//3)+(a%3>0)
            
        return cnt
                
          
        
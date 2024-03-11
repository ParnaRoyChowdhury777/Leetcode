class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        dict1 = {}
        dict2 = {}
        flag = 0
        for i in ransomNote:
            dict1[i] = ransomNote.count(i)
        for i in magazine:
            dict2[i] = magazine.count(i)
        print(dict1)
        print(dict2)
        for key in list(dict1.keys()):
            if key in list(dict2.keys()) and dict1[key] <= dict2[key]:
                flag = 1
            else:
                flag = 0
                break
        if flag == 1:
            return True
        return False
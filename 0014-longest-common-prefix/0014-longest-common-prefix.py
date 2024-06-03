class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""
        res = ""
        prefix = strs[0]

        for i in range(len(prefix)):
            for str in strs:
                if i == len(str) or prefix[i] != str[i]:
                    return res  
            res += prefix[i]
    
        return res

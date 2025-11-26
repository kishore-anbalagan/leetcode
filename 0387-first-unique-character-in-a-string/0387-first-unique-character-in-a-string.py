class Solution(object):
    def firstUniqChar(self, s):
        n={}
        for i in s:
            n[i]=n.get(i,0)+1
        for i in range(len(s)):
            if n[s[i]]==1:
                return i
        return -1
      
        
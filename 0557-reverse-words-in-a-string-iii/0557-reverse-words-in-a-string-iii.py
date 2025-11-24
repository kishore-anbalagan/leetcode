class Solution(object):
    def reverseWords(self, s):
        a=s.split()
        c=[]
        for i in a:
            c.append(i[::-1])
        return " ".join(c)

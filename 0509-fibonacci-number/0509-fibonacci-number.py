class Solution(object):
    def fib(self, n):
        a=0 
        b=1
        c=0
        for i in range(n):
           c=a
           a=b
           b=c+b
        return a  
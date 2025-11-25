class Solution(object):
    def isHappy(self, n):
        if n==1 or n==7:
            return True
        elif n<10:
            return False
        else:
            s=0
            while(n>0):
                d=n%10
                n//=10
                s+=d*d
            return self.isHappy(s)
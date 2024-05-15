class Solution:
    def fib(self, n: int) -> int:
        if n = 0 or n = 1:
            return n
        a,b = 0,1
        for i in range(1,n):
            sum = a+b
            a = b
            b = sum
        return b
        


        
class Solution {
    public int[] countBits(int n) {
    /* Brute force approach:
    We will find all the bits of each and every number, calculate total number
    of 1's and store them in our result array. */

    /* Optimal Approach:
    If We look at each bits of a number we can see a pattern in all:
    0 -> 0               4 -> 100
    1 -> 1               5 -> 101
    2 -> 10              6 -> 110
    3 -> 11              7 -> 111
    
    for even number:
    For even number we can observe that if we do n/2 then the bits of n and 
    the n/2 are the same.
    eg: 4/2 = 2
    Number of bits in 4 is 1 and in 2 its 1 too. Similar pattern is there 
    in other even numbers.
    
    for odd number:
    eg: 7/2 = 3
    number of 1 bits in 7 are 3 and number of bits in 3 are 2.
    eg: 5/2 = 2
    number of 1 bits in 5 are 2 and number of bits in 2 are 1.
    So if we clearly look into it, can we say that in case of odd number,
    the number of 1 bits is 1 + n/2 right? So, this is the approach. */

    int[] ans = new int[n+1];
    for(int i = 1; i<= n; i++){
        if(i%2 == 0){
            ans[i] = ans[i/2];
        }else{
            ans[i] = 1 + ans[i/2];
        }
    }

    return ans;

    }
}
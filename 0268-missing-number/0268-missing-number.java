class Solution {
    public int missingNumber(int[]nums){
        /** Optimal Approach: Summation
        eg: given arr: [3,0,1] and the range is [0,1,2,3]
        so if we add each number of arr i.e 3+0+1 = 4 and add each number 
        of the range by using the formula(sum of 1st n terms) n*(n+1)/2 
        And subtract them 6-4 = 2 we get our missing number */
        int rangeSum = 0, count = 0;
        int n = nums.length;
        rangeSum = (n*(n+1))/2;
        for(int i = 0; i < nums.length; i++){
            count += nums[i];
            
        }

        return rangeSum - count;
    }
    // public int missingNumber(int[] nums) {
    //     /** Approach1: Using HashSet: We add all the elements of the array   
    //     in the hashset. Then we iterate through our array and see if that ith
    //     element is present or not in out hashset. If its not then
    //     will return that num. */

    //     HashSet<Integer> set = new HashSet<>();
    //     for(int ele: nums)
    //         set.add(ele);
        
    //     for(int i = 0; i <= nums.length; i++){
    //         if(!set.contains(i))
    //             return i;

    //     }

    //     return -1;
    //      TC: O(N) + O(N) ~ O(N)  SC: O(N)
    // }
}
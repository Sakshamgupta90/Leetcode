class Solution {
    public int missingNumber(int[] nums) {
        /** Approach1: Using HashSet: We add all the elements of the array into
        the hashset. Then we iterate through our array and see if that ith
        element is present or not in out hashset. If its not then
        will return that num. */

        HashSet<Integer> set = new HashSet<>();
        for(int ele: nums)
            set.add(ele);
        
        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i))
                return i;

        }

        return -1;
    }
}
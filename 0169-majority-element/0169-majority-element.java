class Solution {
    public int majorityElement(int[] nums) {
        //Moores Voting Algorithm: Whenever we need to find the max number
        int count= 0;
        int element = 0;
        
        for(int num: nums){
            if(count == 0)
                element = num;
            
            if(num == element)
                count++;
            else
                count--;
        }
        
        return element;
    }
}
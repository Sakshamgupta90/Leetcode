class Solution {
     public List<List<Integer>> findMatrix(int[] nums) {
         /** We will keep on adding the numbers according to the frequency 
         Iterate through each element (c) in the input array.
        Check if the frequency of the current element is greater than or
         equal to the size of the result list (ans). If true, add a new 
         ArrayList to the result list.

        Store the integer in the list corresponding to its current frequency
         (freq[c]). Increment the frequency. while Adding elements according to 
         their frequncies, we are ensured that all distincts elements are 
         being kept in a row.*/
         int[] freq = new int[nums.length + 1];
         List<List<Integer>> ans = new ArrayList<>();
         for(int ele: nums){

            if(freq[ele] >= ans.size())
                ans.add(new ArrayList<>());
            
            ans.get(freq[ele]).add(ele);
            freq[ele]++;
         }
         return ans;
         //TC: O(N) SC: O(1)
     }

    /************************************************************************/

    public List<List<Integer>> findMatrix_usingHashMap(int[] nums) {
        /**Using HashMap:
        First we create a concurrent hashmap, and keep track of the freq. of
         each element of our array. After this, we will iterate till our map 
         is not null, and will iterate to each and every element present in map.
         We keep on decrementing the value and whenever the element will 0
         we remove it from our hashmap. 
         While iterating, we are removing the elements from the map, so it 
         leads to throw java.util.ConcurrentModificationException error.
         So, to overcome this, we are using concurrent hashmap, using which
         we can modify our map in between. */
        List<List<Integer>> ans = new ArrayList<>();
        ConcurrentHashMap<Integer, Integer> countMap = new ConcurrentHashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        while (!countMap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                temp.add(entry.getKey());
                entry.setValue(entry.getValue() - 1);
                if (entry.getValue() == 0) {
                    countMap.remove(entry.getKey());
                }
            }
            ans.add(temp);
        }

        return ans;
        //TC: O(N) SC: O(N)
    }
}
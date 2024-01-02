class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        /**Using HashMap:
        First we create a concurrent hashmap, and keep track of the freq. of
         each element of our array. After this, we will iterate till our map 
         is not null, and will iterate to each and every element present in map
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
    }
}
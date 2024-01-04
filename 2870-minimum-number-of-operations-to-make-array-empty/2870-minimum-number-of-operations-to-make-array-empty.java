class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        int count = 0;
       
            for(Map.Entry<Integer, Integer> tmap : map.entrySet()){
               
                int cnt = tmap.getValue();
                if(cnt == 1)
                    return -1;
                
                count+= cnt/3;
                
                if(cnt%3 != 0){
                    count++;
                    
                }
            }
        

        return count;
    }
}
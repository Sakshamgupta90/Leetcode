class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> hash = new HashMap<>();
        
        for(String s: strs){
            char[] charArray = s.toCharArray();
            String sorted = new String(charArray);
              if(!hash.containsKey(sorted)){
            hash.put(sorted, new ArrayList<>());
        }
            hash.get(sorted).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}
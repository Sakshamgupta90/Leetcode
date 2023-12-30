class Solution {
    public boolean isAnagram(String s, String t) {
        /** Using HashSet: String t is the anagram of string s only if the
        characters of string s are contained in string t. If the char.
        are not present so, rearranging is not possible. */
        HashMap<Character, Integer> map = new HashMap<>();

        if(s == null || t == null || s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        for(char ch: t.toCharArray()){
           Integer cnt = map.get(ch);
           if(cnt == null){
               return false;
           }

           if(cnt == 1)
                map.remove(ch);
            else
                map.put(ch, cnt-1);
        }
    
        return true;
        // TC: O(N) + O(N) SC: O(N)
    }
}
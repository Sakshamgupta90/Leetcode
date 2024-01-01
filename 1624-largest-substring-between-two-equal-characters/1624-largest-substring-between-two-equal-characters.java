class Solution {
    public int maxLengthBetweenEqualCharacters(String s){
        if(s.length() == 1)
            return -1;
        
        HashMap<Character, Integer> map = new HashMap<>();
        int len = -1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int j = map.get(ch);
                len = Math.max(len, i-j-1);

            }else{
                map.put(ch, i);
            }
        }

        return len;
    }
    // public int maxLengthBetweenEqualCharacters(String s) {

    //     if(s.lengh() == 1)
    //         return -1;

    //     int len = Integer.MIN_VALUE;
    //     for(int i = 0; i < s.length(); i++){
    //         char ch = s.charAt(i);
    //         for(int j = i+1; j < s.length(); j++){
    //             char ch2 = s.charAt(j);
    //             if(ch == ch2){
    //                 len = Math.max(len, j-i-1);
    //             }
    //         }
    //     }

    //     if(len == Integer.MIN_VALUE)
    //         return -1;

    //     return len;
    // }
}
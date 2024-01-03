class Solution {
    private int countBeam(String str){
        int count=0;
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == '1')
                count++;
        }
     
        return count;
    }
    public int numberOfBeams(String[] bank) {
        int sum = 0;
        int temp = 0;
        int rowCount=0;

       for(int i = 0; i < bank.length; i++){
           int rowBeamCount = countBeam(bank[i]);
           if(rowBeamCount != 0){
               rowCount++;
              if(rowCount == 1){
                  temp = rowBeamCount;
              }else{
                  sum = sum + (temp * rowBeamCount);
                  temp=rowBeamCount;
              }
           }
           
       }
     

       return rowCount == 1 ? 0: sum;
    }
}
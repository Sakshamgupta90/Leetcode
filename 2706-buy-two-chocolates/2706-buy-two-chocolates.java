class Solution {
    public int buyChoco(int[] prices, int money) {
      int first_min = Integer.MAX_VALUE, second_min = Integer.MAX_VALUE;

      for(int price: prices){
          if(price < first_min){
              second_min = first_min;
              first_min = price;
          }else{
              second_min = Math.min(second_min, price);
          }
      }

      int leftover = money - (first_min + second_min);
      return leftover >= 0 ? leftover : money;
      

    }
}
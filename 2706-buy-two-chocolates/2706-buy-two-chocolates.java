class Solution {
    // **************Approach1 - Brute force -> TC: O(NlogN)*******************
    // public int buyChoco(int[] prices, int money) {
    //     Arrays.sort(prices);
    //     int totalPrice = prices[0] + prices[1];

    //     return totalPrice > money ? money : money - totalPrice;

    // }
    // *******************Approach2 - optimise -> TC : O(N)*********************
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
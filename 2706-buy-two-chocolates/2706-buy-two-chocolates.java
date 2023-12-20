class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int totalPrice = prices[0] + prices[1];

        return totalPrice > money ? money : money - totalPrice;

    }
}
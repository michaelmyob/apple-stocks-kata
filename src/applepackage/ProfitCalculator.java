package applepackage;

public class ProfitCalculator {

    private int[] stocks;

    ProfitCalculator(int[] stocks){
        this.stocks = stocks;
    }


    public int getLowest() {

        int lowest = stocks[0];

        for (int stockPrice : stocks) {
            if (stockPrice < lowest) {
                lowest = stockPrice;
            }
        }
        return lowest;
    }

    public int getMaxProfit() {

        int lowest = stocks[0];
        int maxProfit = 0;
        int newProfit;
        int[] profitPair = new int[2];

        for (int stockPrice : stocks) {
            if (stockPrice < lowest) {
                lowest = stockPrice;
            }

            newProfit = getCurrentProfit(stockPrice, lowest);
            if (newProfit >= maxProfit){
                maxProfit = newProfit;
                profitPair[0] = lowest;
                profitPair[1] = stockPrice;
            }
        }

        System.out.println("Your profit is $" + maxProfit + " (buying for $" + profitPair[0] + " and selling for $" + profitPair[1] + ")");
        return maxProfit;
    }

    private int getCurrentProfit(int currentNumber, int lowestNumber) {
        return currentNumber - lowestNumber;
    }
}
package applepackage;

import java.util.Arrays;

public class ProfitCalculator {

    private int[] stocks;
    private int[] profitPair;

    ProfitCalculator(int[] stocks){
        this.stocks = stocks;
        System.out.println("Input: " + Arrays.toString(stocks));
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
        profitPair = new int[2];

        for (int stockPrice : stocks) {

            if (stockPrice < lowest) {
                lowest = stockPrice;
            }

            newProfit = getCurrentProfit(stockPrice, lowest);

            if (newProfit > maxProfit) {
                maxProfit = newProfit;

                profitPair[0] = lowest;
                profitPair[1] = stockPrice;
            }
        }

        if (maxProfit != 0) {
            System.out.println("Your profit is $" + maxProfit + " (buying for $" + profitPair[0] + " and selling for $" + profitPair[1] + ")");
            return maxProfit;
        } else {
            System.out.println("There cannot be a profit made today :(");
            return -1;
        }
    }

    public String getProfitPair() {
        return Arrays.toString(profitPair);
    }

    private int getCurrentProfit(int currentNumber, int lowestNumber) {
        return currentNumber - lowestNumber;
    }
}
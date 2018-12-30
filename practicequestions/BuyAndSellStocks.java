/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

public class BuyAndSellStocks {
    
    public static void main(String [] args)
    {
        int [] stockPrices = {100, 80, 120, 130, 70, 60, 100, 125};
        System.out.println(getProfit(stockPrices));
    }
    
    public static int getProfit(int [] stockPrices)
    {
        int profit = 0;
        
        int minimumPrice = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < stockPrices.length ; i++)
        {
            profit = Math.max(profit , stockPrices[i] - minimumPrice);
            minimumPrice = Math.min(stockPrices[i],minimumPrice);
        }
        
        return profit;
    }
}
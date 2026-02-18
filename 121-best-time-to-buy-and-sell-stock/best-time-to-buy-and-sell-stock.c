int maxProfit(int* prices, int pricesSize) {
    int minprice=prices[0];
    int profit=0;
    for(int i=1;i<pricesSize;i++)
    {
        if(minprice>prices[i])
        {
            minprice=prices[i];
        }
        else
        {
            int temp=prices[i]-minprice;
            if(temp>profit)
            {
                profit=temp;
            }
        }
    }
    return profit;
}
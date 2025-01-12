
public class ProfitAndLoss{
	public static void main(String[] args) {

		int costPrice = 129;
		int sellingPrice = 191;
		
		//Calculation of profit
		int profit = sellingPrice-costPrice;
		
		//Calculation of profit percentage
		float profitPercentage = ((float)profit/(float)costPrice)*100;
		
		System.out.println("The Cost Price is INR " + costPrice + "and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}

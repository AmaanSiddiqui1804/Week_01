
public class UniversityFeeDiscount {
    public static void main(String[] args) {

        
        int fee = 125000;

        int discountPercent = 10;
		
        // Calculation of discount
        int discount = (fee * 10)/100;
		
		//Calculation of discounted fees
        int discountedFees = fee - discount;
       
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFees);

    }
}

import java.text.NumberFormat;

/**
 * @author Stephen Meckstroth and Evan Batschew
 * Assignment 01
 * Course IT2045 Section 001
 * Due Date: Jan 16, 2018
 * Description: Create a an eclipse java project that contains a stub class to calculate compound interest
 * Citations: N/A
 * 
 */
public class Main {
	private static Double Principle = 140000.00;
	private static Double InterestRate = .045;
	private static int CompoundingsPerPeriod = 12;
	private static int NumberOfPeriods = 30;

	public static void main(String[] args) {
		
		// Declare and instantiate an object of the 'InterestCalculator' class
		InterestCalculator newCalculator = new InterestCalculator(Principle, InterestRate, CompoundingsPerPeriod, NumberOfPeriods);
				
		//Since main class is static, all calculations have to be done in one statement
		// Note that in order to round to 2 decimal places in one statement I first multiplied to result by 100, converted to a long using Math.round, then divided the result by 100 again
		if (Double.valueOf(Math.round(Double.valueOf(Principle * (Math.pow(1 + InterestRate/CompoundingsPerPeriod,(CompoundingsPerPeriod*NumberOfPeriods))))*100))/100 == newCalculator.getAmountAccumulated()) {
			System.out.println("We matched with a calculated value for Amount Accumulated of:\n" + NumberFormat.getCurrencyInstance().format(Double.valueOf(Math.round(Double.valueOf(Principle * (Math.pow(1 + InterestRate/CompoundingsPerPeriod,(CompoundingsPerPeriod*NumberOfPeriods))))*100))/100));
		} else {
			System.out.println("Uh Oh, We didn't match!  The main class calculated " + Double.valueOf(Math.round(Double.valueOf(Principle * (Math.pow(1 + InterestRate/CompoundingsPerPeriod,(CompoundingsPerPeriod*NumberOfPeriods))))*100))/100
						+ " but the InterestCalculator class calculated: " + newCalculator.getAmountAccumulated());
		}
	}
	
}


/*
 * Name: Evan Batsch
 * Class: IT 2045C 001
 * Date Written: Jan 10th 2018
 * Description: This class calculates accumulated interest, given four relevant parameters.
 * Citations: Method for rounding double to two decimal places was identified
 * (...)in a StackOverflow question and taken from Oracle documentation.
 * Other: n/a
 */

import java.text.DecimalFormat;

public class InterestCalculator {
	// Properties
	double principle;
	double interestrate;
	int compoundingsperperiod;
	int numberofperiods;
	
	// Getters
	public double getPrinciple() {return principle;}
	public double getInterestRate() {return interestrate;}
	public int getCompoundingsPerPeriod() {return compoundingsperperiod;}
	public int getNumberOfPeriods() {return numberofperiods;}
	
	// Setters
	public void setPrinciple(double principle) {this.principle = principle;}
	public void setInterestRate(double interestrate) {this.interestrate = interestrate;}
	public void setCompoundingsPerPeriod(int compoundingsperperiod) {this.compoundingsperperiod = compoundingsperperiod;}
	public void setNumberOfPeriods(int numberofperiods) {this.numberofperiods = numberofperiods;}
	
	// Constructor
	public InterestCalculator(double principle, double interestrate, int compoundingsperperiod, int numberofperiods) {
		setPrinciple(principle);
		setInterestRate(interestrate);
		setCompoundingsPerPeriod(compoundingsperperiod);
		setNumberOfPeriods(numberofperiods);
	}
	
	// Method to calculate total amount of accumulated interest
	public double getAmountAccumulated() {
		double amountAccumulated = principle*(Math.pow((1+(interestrate/compoundingsperperiod)), (compoundingsperperiod*numberofperiods)));
		// Round double to two decimal places
		DecimalFormat currencyForm = new DecimalFormat("#.##");
        return Double.valueOf(currencyForm.format(amountAccumulated));
	}
}

package com.hometask.interest;
import java.util.Scanner;

public class InterestService {

	private Data interestData;
	private double simpleInterest,compoundInterest;
	public double getSimpleInterest() {
		return simpleInterest;
	}
	public void setSimpleInterest(double simpleInterest) {
		this.simpleInterest = simpleInterest;
	}
	public double getCompoundInterest() {
		return compoundInterest;
	}
	public void setCompoundInterest(double compoundInterest) {
		this.compoundInterest = compoundInterest;
	}
	public void getDataFromInput(Scanner input) {
		
		this.interestData=new Data();
		//input for Principle (P)
		this.interestData.setPrinciple(input.nextDouble());
		//input for RateOfInterest (R)
		this.interestData.setRateOfInterest(input.nextDouble());
		//input for Time Period (T)
		this.interestData.setTimePeriod(input.nextDouble());
	}
	public Data getInterestData() {
		return interestData;
	}
	public void setInterestData(Data interestData) {
		this.interestData = interestData;
	}
	public void calculateSimpleInterest() {
		
		InterestCalculator simpleInterestCalculator=new SimpleInterestCalculator();
		this.setSimpleInterest(simpleInterestCalculator.calculate(interestData));
	}
	public void calculateCompoundInterest() {
		InterestCalculator compoundInterestCalculator=new CompoundInterestCalculator();
		this.setCompoundInterest(compoundInterestCalculator.calculate(interestData));
	}
}

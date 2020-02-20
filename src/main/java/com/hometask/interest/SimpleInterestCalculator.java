package com.hometask.interest;

public class SimpleInterestCalculator implements InterestCalculator{

	
	@Override
	public double calculate(Data interestData) {

		return (interestData.getPrinciple()*interestData.getRateOfInterest()*interestData.getTimePeriod())/100;
	}
}

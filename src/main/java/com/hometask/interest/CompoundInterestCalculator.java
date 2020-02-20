package com.hometask.interest;
import java.lang.*;

public class CompoundInterestCalculator implements InterestCalculator{

	@Override
	public double calculate(Data interestData) {
		
		return ((interestData.getPrinciple())*(Math.pow((1+(interestData.getRateOfInterest())/100), interestData.getTimePeriod()))-interestData.getPrinciple());
	}
}

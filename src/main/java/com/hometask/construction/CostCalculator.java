package com.hometask.construction;

import java.util.Map;

public class CostCalculator {

	public Double calculate(Data constructionData,Map<String,Double> materials) {
		
		if(materials.get(constructionData.getMaterialType().toLowerCase())==null) {
			return (double) 0;
		}
		Double costPerSquareFeet=materials.get(constructionData.getMaterialType().toLowerCase());
		return (costPerSquareFeet*(constructionData.getArea()));
	}
}

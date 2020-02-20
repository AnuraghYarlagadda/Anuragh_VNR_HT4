package com.hometask.construction;

import java.util.Map;
import java.util.Scanner;

public class ConstructionCostService {

	private Data constructionData;
	private Double constructionCost;
	private Map<String,Double>materials;
	public Data getConstructionData() {
		return constructionData;
	}
	public void setConstructionData(Data constructionData) {
		this.constructionData = constructionData;
	}
	public Double getConstructionCost() {
		return constructionCost;
	}
	public void setConstructionCost(Double constructionCost) {
		this.constructionCost = constructionCost;
	}
	public void getDataFromInput(Scanner input) {
		
		this.constructionData=new Data();
		
		//input for area
		this.constructionData.setArea(input.nextDouble());
		
		input.nextLine();
		
		//input for material type
		this.constructionData.setMaterialType(input.nextLine());
	}
	public void calculateCost() {
		
		CostCalculator costCalculator = new CostCalculator();
		this.setConstructionCost(costCalculator.calculate(this.constructionData, materials));
	}
	public void setMaterials(Map<String,Double> materials) {
		this.materials = materials;
	}
}

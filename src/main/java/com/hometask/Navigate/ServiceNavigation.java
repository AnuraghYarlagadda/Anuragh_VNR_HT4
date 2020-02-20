package com.hometask.Navigate;
import com.hometask.construction.*;
import com.hometask.interest.*;
import java.util.Scanner;

public class ServiceNavigation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int option;
		Scanner input=new Scanner(System.in);
		
		// 1 for Interest 2 for Construction
		option=input.nextInt();
		
		if(option==1) {
			//navigating to Interest Service
			InterestService interestService=new InterestService();
			//reading input
			interestService.getDataFromInput(input);
			
			interestService.calculateCompoundInterest();
			
			interestService.calculateSimpleInterest();
		}
		else if(option==2) {
			//navigating to Construction Service
			
			ConstructionCostService constructionService=new ConstructionCostService();
			
			Material material=new Material();
			material.setMaterials();
			
			constructionService.setMaterials(material.getMaterials());
			
			constructionService.getDataFromInput(input);
			
			constructionService.calculateCost();
		}
		else {
			//Invalid Entry
		}
		
	}

}

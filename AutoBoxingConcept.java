package com.csi.core;

public class AutoBoxingConcept {
	public static void main(String[] args) {

		int empId =121;
		
		Integer employeeId = empId;// Autoboxing
		
		System.out.println("\n Employee Id: "+ employeeId);
	
	
		Double productPrice=11.22;
		
		double pPrice=productPrice;// UnBoxing
		
		System.out.println("\n Product Price: "+ pPrice);
	}
}

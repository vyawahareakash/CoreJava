package com.csi.core;

public class TypeCastConcept {
	public static void main(String[] args) {

		int productPrice = 56;

		double pPrice = productPrice;// upcasting

		System.out.println("\n Product Price: " + pPrice);

		double empSalary = 9999.99;

		int employeeSalary = (int) empSalary;// downcasting

		System.out.println("\n Employee Salary: " + employeeSalary);

		int productCode = 12345;

		String pCode = String.valueOf(productCode);

		System.out.println("\n Product Code: " + pCode);

		String prodCode = "AABB";

		int prCode = Integer.valueOf(prodCode);

		System.out.println("\n prCode: " + prCode);
		
		
		long empUID = 12345678999L;
		
		

	}
}

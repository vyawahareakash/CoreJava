package com.csi.privatemodifiers;

public class DefaultConcept {
	
	public String empName="BINU";
	public static void main(String[] args) {

		Customer cc = new Customer();

		cc.custId = 121;
		cc.custName = "SWARA";

		System.out.println("\n Customer Id: " + cc.custId + "\n Customer Name: " + cc.custName);
	}
}

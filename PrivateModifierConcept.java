package com.csi.privatemodifiers;

class Customer {
	protected int custId;

	String custName;

}

public class PrivateModifierConcept {
	
	 protected String productName ="MI SMART TV";
	public static void main(String[] args) {

		Customer cc = new Customer();

		cc.custId = 121;
		cc.custName = "SWARA";

		System.out.println("\n Customer Id: " + cc.custId + "\n Customer Name: " + cc.custName);

	}
}

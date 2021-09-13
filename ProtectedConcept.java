package com.csi.protectedbase;

import com.csi.privatemodifiers.DefaultConcept;
import com.csi.privatemodifiers.PrivateModifierConcept;

public class ProtectedConcept extends PrivateModifierConcept{
	public static void main(String[] args) {

		ProtectedConcept p1 = new ProtectedConcept();
		
		System.out.println("\n Product Name: "+ p1.productName);
		
		DefaultConcept dc = new DefaultConcept();
		
		System.out.println("Employee Name: "+ dc.empName);
	}
}

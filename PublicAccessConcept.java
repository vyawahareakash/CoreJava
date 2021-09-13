package com.csi.privatemodifiers;

import com.csi.publicscope.Department;

public class PublicAccessConcept extends Department{
	public static void main(String[] args) {
		PublicAccessConcept dd = new PublicAccessConcept();

		System.out.println("\n Department Name: "+ dd.deptName);
	}
}

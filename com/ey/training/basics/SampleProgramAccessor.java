package com.ey.training.basics;

public class SampleProgramAccessor {
	
	public static void main(String[] args) {
		//object for SampleProgram class
		//using new operator you can create an object for a class
		//classname obj = new classname();
		//(.)member opertator which is used to access members using
		//Object is the top class for all the classes in java.
		
		SampleProgram obj = new SampleProgram();
		obj.addTwoValues();
		obj.subtractTwoValues();
		obj.multiplyTwoValues();
		obj.divideTwoValues();
	}

}

package com.DataType;

public class DataTypeExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Syntax
		//DataType VariableName=Value
		//whenever a value is assigned to a variableName -VariableName should declared with a DataType
		byte byteVariable=10;
		byteVariable=20;
		System.out.println(byteVariable);
		//*Variable is Temporary Memory-It is capable of storing only latest value which is assigned to it.
		// Once a variable declared with a data type we can use it in same class without declaring the Data type again
		System.out.println("The value of byteVariable is -"+byteVariable);
		System.out.println();
		
		short shortVariable=50;
		System.out.println("The value of byteVariable is -"+shortVariable);
		System.out.println();
		
		long longVariable=70;
		System.out.println("The value of longVariable is -"+longVariable);
		System.out.println();
		
		int intVariable=100;
		System.out.println("The value of intVariable is -"+intVariable);
		System.out.println();
		
		char charVariable='A';
		System.out.println("The value of charVariable is -"+charVariable);
		System.out.println();
		
		char charLowerCaseVariable='a';
		System.out.println("The value of charLowerCaseVariable is -"+charLowerCaseVariable);
		System.out.println();
		
		charVariable='B';
		System.out.println("The value of charVariable is -"+charVariable);
		System.out.println();
		
		int asciiVariable='A';
		System.out.println("The value of asciiVariable is -"+asciiVariable);
		System.out.println();
		
		asciiVariable='c';
		System.out.println("The value of asciiVariable is -"+asciiVariable);
		System.out.println();
		
		boolean booleanVariable=true;
		System.out.println("The value of booleanVariable is -"+booleanVariable);
		System.out.println();
		booleanVariable=false;
		System.out.println(" The value of the booleanVariable is :- "+booleanVariable);
		System.out.println();

		float floatVariable=65;
		System.out.println(" The value of the floatVariable is :- "+floatVariable);
		floatVariable=100.123f;
		System.out.println(" The value of the floatVariable is :- "+floatVariable);
		System.out.println();
		floatVariable=100.123451f;
		System.out.println(" The value of the floatVariable is :- "+floatVariable);
		System.out.println();


		double doubleVariable=200.12345;
		System.out.println(" The value of the doubleVariable is :- "+doubleVariable);
		System.out.println();
		doubleVariable=200.123456789;
		System.out.println(" The value of the doubleVariable is :- "+doubleVariable);
		System.out.println();
		doubleVariable=200.1234567891234987;
		System.out.println(" The value of the doubleVariable is :- "+doubleVariable);
		System.out.println();
		doubleVariable=200.987654321123987654;
		System.out.println(" The value of the doubleVariable is :- "+doubleVariable);
		System.out.println();
	}

}

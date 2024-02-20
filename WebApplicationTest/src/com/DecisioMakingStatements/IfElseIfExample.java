package com.DecisioMakingStatements;

public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

          int var1=60;
          int var2=70;
          int var3=90;

          if(var1>var2 && var1>var3)
          {
          System.out.println(" var1 variable value is greater than var2 and var3 variable values");

          }
          else
          if(var2>var3)
          {
          System.out.println(" var2 variable value is greater than var1 and var3 variable values");
          }
          else
          {
          System.out.println(" var3 variable value is greater than var1 and var2 variable values ");
          }



	}

}

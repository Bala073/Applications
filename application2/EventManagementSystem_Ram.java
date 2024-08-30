package com.evergent.corejava.balakishan.application2;

import java.io.IOException;
import java.util.Scanner;

public class EventManagementSystem_Ram {
	enum module1 {O,P,R,E};
	enum submodule1 {F,S,M};
	enum submodule2  {T,P,M};
	enum submodule3  {I,S,M};
	enum menucode  {A,B};
	static int menuitemcost;
	static int amount;
	static int guest;
	static int amountdisc;
	static int additionalitemcost;

	public static void main(String[] args) throws IOException  {
		 String module = null;
			
		  Scanner br =new Scanner(System.in);
	    
	    System.out.println("\n\t\t \t\t Welcome To EVENT MANAGEMENT SYSTEM");
	    
		while(true)
		{
	
	  
		System.out.println("======================");
		System.out.println(" EMS Main Menu");
		System.out.println("======================");
		System.out.println("O-Order Module");
		System.out.println("P-Payment Module");
		System.out.println("R-Report Module");
		System.out.println("E-Quit Module");
		System.out.println("======================");
	    System.out.println("Enter your Module code (O,P,R,E) : ");


module=br.nextLine();
System.out.println("You entered module is  : " );   

switch(module1.valueOf(module))
{

case O:
	
System.out.println(" Order Module");
System.out.println("======================");
System.out.println("F-to place orders for food");
System.out.println("S-to place for other services");
System.out.println("M-Return to Main Menu");
System.out.println("======================");
System.out.println("Enter your Module code (F,S,M) : ");

	module=br.nextLine();
switch(submodule1.valueOf(module))
{

case F:
	
	
	System.out.println("Menu \t Description  \t Charge per head ");
	System.out.println("===============================================");
	System.out.println("A \t LAMB/Chicken Chop \n \t salad \n\t Mushroom soop \n\t Garlic Bread \n\t Pasta  \t\t\t RM40.00");
	System.out.println("");
	System.out.println("B \t 4 seasons \n \t shark's fin soup \n\t Steamed fish \n\t Baby Kailan \n\t Lemon Chicken \n\t Fried Rice \t\t\t RM50.00");
	System.out.println("===============================================");
	System.out.println("Enter your Menu code (A,B) : ");
	
	
	module=br.nextLine();
	
	
	switch(menucode.valueOf(module))
	{

	case A:
		menuitemcost=40;
		break;
	case B:
		menuitemcost=50;
		break;
	}
	
	
	
	System.out.println("Enter the number of guests");
	
	guest =Integer.parseInt( br.nextLine());
	System.out.println("you selected no of guests are "+guest);
	 amount=menuitemcost*guest;
	
	System.out.println("Amount for ordered food before discount is Rs"+amount);
	if(guest >= 1 && guest <=25)
		amountdisc=(int) (amount-(amount*0.00));
	if(guest >= 26 && guest <=50)
		amountdisc=(int) (amount-(amount*0.03));
	else if(guest >= 51 && guest <=100)
		amountdisc=(int) ((amount-guest*0.05));
	else if(guest >= 101 && guest <=200)
		amountdisc=(int) ((amount-guest*0.08));	
	else if(guest >= 251)
		amountdisc=(int) ((amount-guest*0.10));	

	System.out.println("Amount for ordered food after Discount for selected guests is  Rs"+amountdisc);
	
	
	
break;
case S:
	
	System.out.println("Item \t Description  \t Charge per Unit ");
	System.out.println("========================================================================");
	System.out.println("1 \t Tent \t   RM400.00 per unit of 10 by 10 ft");
	System.out.println("");
	System.out.println("2 \t Chairs \t RM100.00 per unit of 50 chairs");
	System.out.println("");
	System.out.println("3 \t Tables \t RM80.00 per unit of 10 by 10 tables");
	System.out.println("");
	System.out.println("4 \t Table Cloths \t RM20.00 per unit of 10 by 10 table cloths");
	System.out.println("========================================================================");
	System.out.println("Enter your Menu code (1,2,3,4) : ");
	
	module=br.nextLine();
	
	int i=Integer.parseInt(module);
	switch(i)
	{

	case 1:
		additionalitemcost=400;
		break;
	case 2:
		additionalitemcost=100;
		break;
	case 3:
		additionalitemcost=80;
		break;
	case 4:
		additionalitemcost=20;
		break;
	}
	
	System.out.println("Your Additional Cost : Rs "+additionalitemcost);
	
	
break;	
}
break;

case P:
	System.out.println(" Payment Module");
	System.out.println("======================");
	System.out.println("T-to display total amount to be paid");
	System.out.println("P-to make payment");
	System.out.println("M-Return to Main Menu");
	System.out.println("======================");
	System.out.println("Enter your Module code (T,P,M) : ");

	module=br.nextLine();
	switch(submodule2.valueOf(module))
	{

	case T:
		System.out.println("Total Amount to be Paid : Rs"+(amount+additionalitemcost));
		
	break;
	case P:System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost));
	break;	
	}
	break;
	
			
case R:

System.out.println(" Payment Module");
System.out.println("======================");
System.out.println("I-to dispaly invoice for order mode");
System.out.println("S-to display the summary of orders and payments made");
System.out.println("M-Return to Main Menu");
System.out.println("======================");
System.out.println("Enter your Module code (I,S,M) : ");

	module=br.nextLine();
switch(submodule3.valueOf(module))
{

case I:
System.out.println("Invoice Display");
System.out.println("==================");
System.out.println("Ordered Id : " +(Math.ceil(Math.random())));
System.out.println("you selected no of guests are "+guest);
System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost));

break;
case S:
	System.out.println("Summary Of Order");
System.out.println("======================");
System.out.println("you selected Food item cost Rs"+amount);
System.out.println("you selected no of guests are "+guest);
System.out.println("Amount for ordered food after Discount for selected guests is  Rs"+amountdisc);
System.out.println("Your Additional Cost : Rs "+additionalitemcost);
System.out.println("\n");
System.out.println("Total Amount to be Paid : Rs"+(amount+additionalitemcost));
System.out.println("To Make Payment : Rs"+(amountdisc+additionalitemcost));

break;	
}
break;
case E:
System.out.println("Quit Module");
System.exit(0);
	break;

		
		}
		

		
		}
		

	}

}
